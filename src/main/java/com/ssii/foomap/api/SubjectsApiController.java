package com.ssii.foomap.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ssii.foomap.entity.SubjectEntity;
import com.ssii.foomap.entity.SubjectLayerEntity;
import com.ssii.foomap.model.Subject;
import com.ssii.foomap.model.SubjectLayerIndex;
import com.ssii.foomap.service.ISubjectService;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.IOException;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-11T08:16:31.504Z")

@Controller
public class SubjectsApiController implements SubjectsApi {
    @Autowired
    ISubjectService subjectService;

    private static final Logger log = LoggerFactory.getLogger(SubjectsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public SubjectsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<SubjectEntity> addSubject(@ApiParam(value = "用户登录成功后的Token", required = true) @RequestHeader(value = "authoration", required = true) String authoration,
                                                    @ApiParam(value = "专题信息，不包括图层", required = true) @Valid @RequestBody SubjectEntity subject) {
        return ResponseEntity.ok(subjectService.addSubject(subject));
    }

    public ResponseEntity<Boolean> addSubjectLayer(@ApiParam(value = "用户登录成功后的Token", required = true) @RequestHeader(value = "authoration", required = true) String authoration,
                                                   @ApiParam(value = "专题编号", required = true) @PathVariable("id") Integer id,
                                                   @ApiParam(value = "图层信息") @Valid @RequestBody SubjectLayerEntity layer) {
        return ResponseEntity.ok(subjectService.addSubjectLayer(id, layer));
    }

    public ResponseEntity<Void> deleteSubject(@ApiParam(value = "用户登录成功后的Token", required = true) @RequestHeader(value = "authoration", required = true) String authoration,
                                              @ApiParam(value = "专题编号", required = true) @PathVariable("id") Integer id) {
        if (subjectService.delSubject(id)) {
            return ResponseEntity.ok(null);
        }
        return ResponseEntity.ok(null);
    }

    public ResponseEntity<Boolean> deleteSubjectLayer(@ApiParam(value = "用户登录成功后的Token", required = true) @RequestHeader(value = "authoration", required = true) String authoration,
                                                      @ApiParam(value = "专题编号", required = true) @PathVariable("id") Integer id,
                                                      @ApiParam(value = "图层编号", required = true) @PathVariable("layerId") Integer layerId,
                                                      @ApiParam(value = "图层类型",required = true) String layerType) {
        return ResponseEntity.ok(subjectService.delSubjectLayer(id,layerId,layerType));
    }

    public ResponseEntity<List<SubjectLayerIndex>> getSubjectLayers(@ApiParam(value = "用户登录成功后的Token", required = true) @RequestHeader(value = "authoration", required = true) String authoration,
                                                                    @ApiParam(value = "专题编号", required = true) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<SubjectLayerIndex>>(objectMapper.readValue("[ {  \"layerType\" : \"tms\",  \"layerId\" : 0,  \"layerIndex\" : 6}, {  \"layerType\" : \"tms\",  \"layerId\" : 0,  \"layerIndex\" : 6} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<SubjectLayerIndex>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<SubjectLayerIndex>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Subject>> getSubjects(@ApiParam(value = "用户登录成功后的Token", required = true) @RequestHeader(value = "authoration", required = true) String authoration) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Subject>>(objectMapper.readValue("[ {  \"image\" : {    \"drawable-hover\" : \"drawable-hover\",    \"drawable\" : \"drawable\",    \"size\" : [ 6.02745618307040320615897144307382404804229736328125, 6.02745618307040320615897144307382404804229736328125 ],    \"drawable-disable\" : \"drawable-disable\",    \"drawable-selected\" : \"drawable-selected\"  },  \"name\" : \"name\",  \"icon\" : {    \"drawable-hover\" : \"drawable-hover\",    \"drawable\" : \"drawable\",    \"size\" : [ 6.02745618307040320615897144307382404804229736328125, 6.02745618307040320615897144307382404804229736328125 ],    \"drawable-disable\" : \"drawable-disable\",    \"drawable-selected\" : \"drawable-selected\"  },  \"layers\" : [ {    \"image\" : {      \"drawable-hover\" : \"drawable-hover\",      \"drawable\" : \"drawable\",      \"size\" : [ 6.02745618307040320615897144307382404804229736328125, 6.02745618307040320615897144307382404804229736328125 ],      \"drawable-disable\" : \"drawable-disable\",      \"drawable-selected\" : \"drawable-selected\"    },    \"name\" : \"name\",    \"icon\" : {      \"drawable-hover\" : \"drawable-hover\",      \"drawable\" : \"drawable\",      \"size\" : [ 6.02745618307040320615897144307382404804229736328125, 6.02745618307040320615897144307382404804229736328125 ],      \"drawable-disable\" : \"drawable-disable\",      \"drawable-selected\" : \"drawable-selected\"    },    \"data-source\" : {      \"popupFields\" : [ {        \"name\" : \"name\",        \"label\" : \"label\",        \"type\" : \"type\"      }, {        \"name\" : \"name\",        \"label\" : \"label\",        \"type\" : \"type\"      } ],      \"generalFields\" : [ {        \"name\" : \"name\",        \"label\" : \"label\",        \"type\" : \"type\"      }, {        \"name\" : \"name\",        \"label\" : \"label\",        \"type\" : \"type\"      } ],      \"queryFields\" : [ \"queryFields\", \"queryFields\" ],      \"name\" : \"name\",      \"fields\" : [ {        \"name\" : \"name\",        \"label\" : \"label\",        \"type\" : \"type\"      }, {        \"name\" : \"name\",        \"label\" : \"label\",        \"type\" : \"type\"      } ],      \"editableFields\" : [ \"editableFields\", \"editableFields\" ]    },    \"index\" : 5,    \"domains\" : [ \"domains\", \"domains\" ],    \"id\" : 5,    \"type\" : \"wms\",    \"url\" : \"http://{s}.tianditu.com/vec_a/{x}/{y}/{z}.jpg\",    \"descripton\" : \"descripton\",    \"tags\" : [ \"tags\", \"tags\" ]  }, {    \"image\" : {      \"drawable-hover\" : \"drawable-hover\",      \"drawable\" : \"drawable\",      \"size\" : [ 6.02745618307040320615897144307382404804229736328125, 6.02745618307040320615897144307382404804229736328125 ],      \"drawable-disable\" : \"drawable-disable\",      \"drawable-selected\" : \"drawable-selected\"    },    \"name\" : \"name\",    \"icon\" : {      \"drawable-hover\" : \"drawable-hover\",      \"drawable\" : \"drawable\",      \"size\" : [ 6.02745618307040320615897144307382404804229736328125, 6.02745618307040320615897144307382404804229736328125 ],      \"drawable-disable\" : \"drawable-disable\",      \"drawable-selected\" : \"drawable-selected\"    },    \"data-source\" : {      \"popupFields\" : [ {        \"name\" : \"name\",        \"label\" : \"label\",        \"type\" : \"type\"      }, {        \"name\" : \"name\",        \"label\" : \"label\",        \"type\" : \"type\"      } ],      \"generalFields\" : [ {        \"name\" : \"name\",        \"label\" : \"label\",        \"type\" : \"type\"      }, {        \"name\" : \"name\",        \"label\" : \"label\",        \"type\" : \"type\"      } ],      \"queryFields\" : [ \"queryFields\", \"queryFields\" ],      \"name\" : \"name\",      \"fields\" : [ {        \"name\" : \"name\",        \"label\" : \"label\",        \"type\" : \"type\"      }, {        \"name\" : \"name\",        \"label\" : \"label\",        \"type\" : \"type\"      } ],      \"editableFields\" : [ \"editableFields\", \"editableFields\" ]    },    \"index\" : 5,    \"domains\" : [ \"domains\", \"domains\" ],    \"id\" : 5,    \"type\" : \"wms\",    \"url\" : \"http://{s}.tianditu.com/vec_a/{x}/{y}/{z}.jpg\",    \"descripton\" : \"descripton\",    \"tags\" : [ \"tags\", \"tags\" ]  } ],  \"description\" : \"description\",  \"index\" : 1,  \"id\" : 0,  \"tags\" : [ \"tags\", \"tags\" ]}, {  \"image\" : {    \"drawable-hover\" : \"drawable-hover\",    \"drawable\" : \"drawable\",    \"size\" : [ 6.02745618307040320615897144307382404804229736328125, 6.02745618307040320615897144307382404804229736328125 ],    \"drawable-disable\" : \"drawable-disable\",    \"drawable-selected\" : \"drawable-selected\"  },  \"name\" : \"name\",  \"icon\" : {    \"drawable-hover\" : \"drawable-hover\",    \"drawable\" : \"drawable\",    \"size\" : [ 6.02745618307040320615897144307382404804229736328125, 6.02745618307040320615897144307382404804229736328125 ],    \"drawable-disable\" : \"drawable-disable\",    \"drawable-selected\" : \"drawable-selected\"  },  \"layers\" : [ {    \"image\" : {      \"drawable-hover\" : \"drawable-hover\",      \"drawable\" : \"drawable\",      \"size\" : [ 6.02745618307040320615897144307382404804229736328125, 6.02745618307040320615897144307382404804229736328125 ],      \"drawable-disable\" : \"drawable-disable\",      \"drawable-selected\" : \"drawable-selected\"    },    \"name\" : \"name\",    \"icon\" : {      \"drawable-hover\" : \"drawable-hover\",      \"drawable\" : \"drawable\",      \"size\" : [ 6.02745618307040320615897144307382404804229736328125, 6.02745618307040320615897144307382404804229736328125 ],      \"drawable-disable\" : \"drawable-disable\",      \"drawable-selected\" : \"drawable-selected\"    },    \"data-source\" : {      \"popupFields\" : [ {        \"name\" : \"name\",        \"label\" : \"label\",        \"type\" : \"type\"      }, {        \"name\" : \"name\",        \"label\" : \"label\",        \"type\" : \"type\"      } ],      \"generalFields\" : [ {        \"name\" : \"name\",        \"label\" : \"label\",        \"type\" : \"type\"      }, {        \"name\" : \"name\",        \"label\" : \"label\",        \"type\" : \"type\"      } ],      \"queryFields\" : [ \"queryFields\", \"queryFields\" ],      \"name\" : \"name\",      \"fields\" : [ {        \"name\" : \"name\",        \"label\" : \"label\",        \"type\" : \"type\"      }, {        \"name\" : \"name\",        \"label\" : \"label\",        \"type\" : \"type\"      } ],      \"editableFields\" : [ \"editableFields\", \"editableFields\" ]    },    \"index\" : 5,    \"domains\" : [ \"domains\", \"domains\" ],    \"id\" : 5,    \"type\" : \"wms\",    \"url\" : \"http://{s}.tianditu.com/vec_a/{x}/{y}/{z}.jpg\",    \"descripton\" : \"descripton\",    \"tags\" : [ \"tags\", \"tags\" ]  }, {    \"image\" : {      \"drawable-hover\" : \"drawable-hover\",      \"drawable\" : \"drawable\",      \"size\" : [ 6.02745618307040320615897144307382404804229736328125, 6.02745618307040320615897144307382404804229736328125 ],      \"drawable-disable\" : \"drawable-disable\",      \"drawable-selected\" : \"drawable-selected\"    },    \"name\" : \"name\",    \"icon\" : {      \"drawable-hover\" : \"drawable-hover\",      \"drawable\" : \"drawable\",      \"size\" : [ 6.02745618307040320615897144307382404804229736328125, 6.02745618307040320615897144307382404804229736328125 ],      \"drawable-disable\" : \"drawable-disable\",      \"drawable-selected\" : \"drawable-selected\"    },    \"data-source\" : {      \"popupFields\" : [ {        \"name\" : \"name\",        \"label\" : \"label\",        \"type\" : \"type\"      }, {        \"name\" : \"name\",        \"label\" : \"label\",        \"type\" : \"type\"      } ],      \"generalFields\" : [ {        \"name\" : \"name\",        \"label\" : \"label\",        \"type\" : \"type\"      }, {        \"name\" : \"name\",        \"label\" : \"label\",        \"type\" : \"type\"      } ],      \"queryFields\" : [ \"queryFields\", \"queryFields\" ],      \"name\" : \"name\",      \"fields\" : [ {        \"name\" : \"name\",        \"label\" : \"label\",        \"type\" : \"type\"      }, {        \"name\" : \"name\",        \"label\" : \"label\",        \"type\" : \"type\"      } ],      \"editableFields\" : [ \"editableFields\", \"editableFields\" ]    },    \"index\" : 5,    \"domains\" : [ \"domains\", \"domains\" ],    \"id\" : 5,    \"type\" : \"wms\",    \"url\" : \"http://{s}.tianditu.com/vec_a/{x}/{y}/{z}.jpg\",    \"descripton\" : \"descripton\",    \"tags\" : [ \"tags\", \"tags\" ]  } ],  \"description\" : \"description\",  \"index\" : 1,  \"id\" : 0,  \"tags\" : [ \"tags\", \"tags\" ]} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Subject>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Subject>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Subject> updateSubject(@ApiParam(value = "用户登录成功后的Token", required = true) @RequestHeader(value = "authoration", required = true) String authoration, @ApiParam(value = "专题信息，不包括图层", required = true) @Valid @RequestBody Subject subject) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Subject>(objectMapper.readValue("{  \"image\" : {    \"drawable-hover\" : \"drawable-hover\",    \"drawable\" : \"drawable\",    \"size\" : [ 6.02745618307040320615897144307382404804229736328125, 6.02745618307040320615897144307382404804229736328125 ],    \"drawable-disable\" : \"drawable-disable\",    \"drawable-selected\" : \"drawable-selected\"  },  \"name\" : \"name\",  \"icon\" : {    \"drawable-hover\" : \"drawable-hover\",    \"drawable\" : \"drawable\",    \"size\" : [ 6.02745618307040320615897144307382404804229736328125, 6.02745618307040320615897144307382404804229736328125 ],    \"drawable-disable\" : \"drawable-disable\",    \"drawable-selected\" : \"drawable-selected\"  },  \"layers\" : [ {    \"image\" : {      \"drawable-hover\" : \"drawable-hover\",      \"drawable\" : \"drawable\",      \"size\" : [ 6.02745618307040320615897144307382404804229736328125, 6.02745618307040320615897144307382404804229736328125 ],      \"drawable-disable\" : \"drawable-disable\",      \"drawable-selected\" : \"drawable-selected\"    },    \"name\" : \"name\",    \"icon\" : {      \"drawable-hover\" : \"drawable-hover\",      \"drawable\" : \"drawable\",      \"size\" : [ 6.02745618307040320615897144307382404804229736328125, 6.02745618307040320615897144307382404804229736328125 ],      \"drawable-disable\" : \"drawable-disable\",      \"drawable-selected\" : \"drawable-selected\"    },    \"data-source\" : {      \"popupFields\" : [ {        \"name\" : \"name\",        \"label\" : \"label\",        \"type\" : \"type\"      }, {        \"name\" : \"name\",        \"label\" : \"label\",        \"type\" : \"type\"      } ],      \"generalFields\" : [ {        \"name\" : \"name\",        \"label\" : \"label\",        \"type\" : \"type\"      }, {        \"name\" : \"name\",        \"label\" : \"label\",        \"type\" : \"type\"      } ],      \"queryFields\" : [ \"queryFields\", \"queryFields\" ],      \"name\" : \"name\",      \"fields\" : [ {        \"name\" : \"name\",        \"label\" : \"label\",        \"type\" : \"type\"      }, {        \"name\" : \"name\",        \"label\" : \"label\",        \"type\" : \"type\"      } ],      \"editableFields\" : [ \"editableFields\", \"editableFields\" ]    },    \"index\" : 5,    \"domains\" : [ \"domains\", \"domains\" ],    \"id\" : 5,    \"type\" : \"wms\",    \"url\" : \"http://{s}.tianditu.com/vec_a/{x}/{y}/{z}.jpg\",    \"descripton\" : \"descripton\",    \"tags\" : [ \"tags\", \"tags\" ]  }, {    \"image\" : {      \"drawable-hover\" : \"drawable-hover\",      \"drawable\" : \"drawable\",      \"size\" : [ 6.02745618307040320615897144307382404804229736328125, 6.02745618307040320615897144307382404804229736328125 ],      \"drawable-disable\" : \"drawable-disable\",      \"drawable-selected\" : \"drawable-selected\"    },    \"name\" : \"name\",    \"icon\" : {      \"drawable-hover\" : \"drawable-hover\",      \"drawable\" : \"drawable\",      \"size\" : [ 6.02745618307040320615897144307382404804229736328125, 6.02745618307040320615897144307382404804229736328125 ],      \"drawable-disable\" : \"drawable-disable\",      \"drawable-selected\" : \"drawable-selected\"    },    \"data-source\" : {      \"popupFields\" : [ {        \"name\" : \"name\",        \"label\" : \"label\",        \"type\" : \"type\"      }, {        \"name\" : \"name\",        \"label\" : \"label\",        \"type\" : \"type\"      } ],      \"generalFields\" : [ {        \"name\" : \"name\",        \"label\" : \"label\",        \"type\" : \"type\"      }, {        \"name\" : \"name\",        \"label\" : \"label\",        \"type\" : \"type\"      } ],      \"queryFields\" : [ \"queryFields\", \"queryFields\" ],      \"name\" : \"name\",      \"fields\" : [ {        \"name\" : \"name\",        \"label\" : \"label\",        \"type\" : \"type\"      }, {        \"name\" : \"name\",        \"label\" : \"label\",        \"type\" : \"type\"      } ],      \"editableFields\" : [ \"editableFields\", \"editableFields\" ]    },    \"index\" : 5,    \"domains\" : [ \"domains\", \"domains\" ],    \"id\" : 5,    \"type\" : \"wms\",    \"url\" : \"http://{s}.tianditu.com/vec_a/{x}/{y}/{z}.jpg\",    \"descripton\" : \"descripton\",    \"tags\" : [ \"tags\", \"tags\" ]  } ],  \"description\" : \"description\",  \"index\" : 1,  \"id\" : 0,  \"tags\" : [ \"tags\", \"tags\" ]}", Subject.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Subject>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Subject>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Boolean> updateSubjectLayer(@ApiParam(value = "用户登录成功后的Token", required = true) @RequestHeader(value = "authoration", required = true) String authoration, @ApiParam(value = "专题编号", required = true) @PathVariable("id") String id, @ApiParam(value = "") @Valid @RequestBody SubjectLayerIndex layer) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Boolean>(objectMapper.readValue("true", Boolean.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Boolean>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Boolean>(HttpStatus.NOT_IMPLEMENTED);
    }

}
