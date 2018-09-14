package com.ssii.foomap.common.util;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.ArrayList;
import java.util.List;

/**
 * Name:ListToArrayConveter
 * Description:
 * Author:yxc
 * Time: 2018/9/14 15:52
 */
@Converter(autoApply = true)
public class ListToArrayConveter implements AttributeConverter<List<String>, Object> {
    @Override
    public PostgreSQLTextArray convertToDatabaseColumn(List<String> attribute) {
        if (attribute == null || attribute.isEmpty()) {
            return null;
        }
        String[] rst = new String[attribute.size()];
        return new PostgreSQLTextArray(attribute.toArray(rst));
    }

    @Override
    public List<String> convertToEntityAttribute(Object dbData) {
        List<String> rst = new ArrayList<>();
        String[] elements = ((String[]) dbData);
        for (String element : elements) {
            rst.add(element);
        }
        return rst;
    }
}
