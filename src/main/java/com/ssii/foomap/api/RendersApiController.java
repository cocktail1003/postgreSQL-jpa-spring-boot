package com.ssii.foomap.api;

import com.ssii.foomap.model.SimpleIconRender;
import com.ssii.foomap.model.SimplePathRender;
import com.ssii.foomap.model.UniqueIconRender;
import com.ssii.foomap.model.UniquePathRender;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-11T08:16:31.504Z")

@Controller
public class RendersApiController implements RendersApi {

    private static final Logger log = LoggerFactory.getLogger(RendersApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public RendersApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<SimpleIconRender> addSimpleIconRender(@ApiParam(value = "用户登录成功后的Token" ,required=true) @RequestHeader(value="authoration", required=true) String authoration,@ApiParam(value = "" ,required=true )  @Valid @RequestBody SimpleIconRender render) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<SimpleIconRender>(objectMapper.readValue("{  \"symbol\" : {    \"popupAnchor\" : [ 7, 7 ],    \"shadowAnchor\" : [ 2, 2 ],    \"iconAnchor\" : [ 5, 5 ],    \"shadowUrl\" : \"shadowUrl\",    \"iconSize\" : [ 1, 1 ],    \"id\" : 6,    \"iconUrl\" : \"iconUrl\",    \"shadowSize\" : [ 5, 5 ]  },  \"id\" : 0}", SimpleIconRender.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<SimpleIconRender>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<SimpleIconRender>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<SimplePathRender> addSimplePathRender(@ApiParam(value = "用户登录成功后的Token" ,required=true) @RequestHeader(value="authoration", required=true) String authoration,@ApiParam(value = "" ,required=true )  @Valid @RequestBody SimplePathRender render) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<SimplePathRender>(objectMapper.readValue("{  \"symbol\" : {    \"color\" : \"color\",    \"weight\" : 5,    \"fill\" : true,    \"stroke\" : true,    \"line-join\" : \"miter\",    \"dash-array\" : \"dash-array\",    \"id\" : 6,    \"radius\" : 1,    \"opacity\" : 5.63737665663332876420099637471139430999755859375,    \"fill-color\" : \"null\",    \"fill-opacity\" : 2.3021358869347654518833223846741020679473876953125,    \"fill-rule\" : \"nonzero\",    \"line-cap\" : \"butt\",    \"dash-offset\" : \"dash-offset\"  },  \"id\" : 0}", SimplePathRender.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<SimplePathRender>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<SimplePathRender>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<UniqueIconRender> addUniqueIconRender(@ApiParam(value = "用户登录成功后的Token" ,required=true) @RequestHeader(value="authoration", required=true) String authoration,@ApiParam(value = "" ,required=true )  @Valid @RequestBody UniqueIconRender render) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<UniqueIconRender>(objectMapper.readValue("{  \"property\" : \"property\",  \"id\" : 0,  \"symbols\" : [ {    \"icon\" : {      \"popupAnchor\" : [ 7, 7 ],      \"shadowAnchor\" : [ 2, 2 ],      \"iconAnchor\" : [ 5, 5 ],      \"shadowUrl\" : \"shadowUrl\",      \"iconSize\" : [ 1, 1 ],      \"id\" : 6,      \"iconUrl\" : \"iconUrl\",      \"shadowSize\" : [ 5, 5 ]    },    \"key\" : \"key\"  }, {    \"icon\" : {      \"popupAnchor\" : [ 7, 7 ],      \"shadowAnchor\" : [ 2, 2 ],      \"iconAnchor\" : [ 5, 5 ],      \"shadowUrl\" : \"shadowUrl\",      \"iconSize\" : [ 1, 1 ],      \"id\" : 6,      \"iconUrl\" : \"iconUrl\",      \"shadowSize\" : [ 5, 5 ]    },    \"key\" : \"key\"  } ]}", UniqueIconRender.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<UniqueIconRender>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<UniqueIconRender>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<UniquePathRender> addUniquePathRender(@ApiParam(value = "用户登录成功后的Token" ,required=true) @RequestHeader(value="authoration", required=true) String authoration,@ApiParam(value = "" ,required=true )  @Valid @RequestBody UniquePathRender render) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<UniquePathRender>(objectMapper.readValue("{  \"property\" : \"property\",  \"id\" : 0,  \"symbols\" : [ {    \"icon\" : {      \"color\" : \"color\",      \"weight\" : 5,      \"fill\" : true,      \"stroke\" : true,      \"line-join\" : \"miter\",      \"dash-array\" : \"dash-array\",      \"id\" : 6,      \"radius\" : 1,      \"opacity\" : 5.63737665663332876420099637471139430999755859375,      \"fill-color\" : \"null\",      \"fill-opacity\" : 2.3021358869347654518833223846741020679473876953125,      \"fill-rule\" : \"nonzero\",      \"line-cap\" : \"butt\",      \"dash-offset\" : \"dash-offset\"    },    \"key\" : \"key\"  }, {    \"icon\" : {      \"color\" : \"color\",      \"weight\" : 5,      \"fill\" : true,      \"stroke\" : true,      \"line-join\" : \"miter\",      \"dash-array\" : \"dash-array\",      \"id\" : 6,      \"radius\" : 1,      \"opacity\" : 5.63737665663332876420099637471139430999755859375,      \"fill-color\" : \"null\",      \"fill-opacity\" : 2.3021358869347654518833223846741020679473876953125,      \"fill-rule\" : \"nonzero\",      \"line-cap\" : \"butt\",      \"dash-offset\" : \"dash-offset\"    },    \"key\" : \"key\"  } ]}", UniquePathRender.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<UniquePathRender>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<UniquePathRender>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Boolean> deleteSimpleIconRender(@ApiParam(value = "用户登录成功后的Token" ,required=true) @RequestHeader(value="authoration", required=true) String authoration,@ApiParam(value = "",required=true) @PathVariable("id") String id) {
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

    public ResponseEntity<Boolean> deleteSimplePathRender(@ApiParam(value = "用户登录成功后的Token" ,required=true) @RequestHeader(value="authoration", required=true) String authoration,@ApiParam(value = "",required=true) @PathVariable("id") String id) {
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

    public ResponseEntity<Boolean> deleteUniqueIconRender(@ApiParam(value = "用户登录成功后的Token" ,required=true) @RequestHeader(value="authoration", required=true) String authoration,@ApiParam(value = "",required=true) @PathVariable("id") String id) {
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

    public ResponseEntity<UniquePathRender> deleteUniquePathRender(@ApiParam(value = "用户登录成功后的Token" ,required=true) @RequestHeader(value="authoration", required=true) String authoration,@ApiParam(value = "",required=true) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<UniquePathRender>(objectMapper.readValue("{  \"property\" : \"property\",  \"id\" : 0,  \"symbols\" : [ {    \"icon\" : {      \"color\" : \"color\",      \"weight\" : 5,      \"fill\" : true,      \"stroke\" : true,      \"line-join\" : \"miter\",      \"dash-array\" : \"dash-array\",      \"id\" : 6,      \"radius\" : 1,      \"opacity\" : 5.63737665663332876420099637471139430999755859375,      \"fill-color\" : \"null\",      \"fill-opacity\" : 2.3021358869347654518833223846741020679473876953125,      \"fill-rule\" : \"nonzero\",      \"line-cap\" : \"butt\",      \"dash-offset\" : \"dash-offset\"    },    \"key\" : \"key\"  }, {    \"icon\" : {      \"color\" : \"color\",      \"weight\" : 5,      \"fill\" : true,      \"stroke\" : true,      \"line-join\" : \"miter\",      \"dash-array\" : \"dash-array\",      \"id\" : 6,      \"radius\" : 1,      \"opacity\" : 5.63737665663332876420099637471139430999755859375,      \"fill-color\" : \"null\",      \"fill-opacity\" : 2.3021358869347654518833223846741020679473876953125,      \"fill-rule\" : \"nonzero\",      \"line-cap\" : \"butt\",      \"dash-offset\" : \"dash-offset\"    },    \"key\" : \"key\"  } ]}", UniquePathRender.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<UniquePathRender>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<UniquePathRender>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<SimpleIconRender> getSimpleIconRender(@ApiParam(value = "用户登录成功后的Token" ,required=true) @RequestHeader(value="authoration", required=true) String authoration,@ApiParam(value = "",required=true) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<SimpleIconRender>(objectMapper.readValue("{  \"symbol\" : {    \"popupAnchor\" : [ 7, 7 ],    \"shadowAnchor\" : [ 2, 2 ],    \"iconAnchor\" : [ 5, 5 ],    \"shadowUrl\" : \"shadowUrl\",    \"iconSize\" : [ 1, 1 ],    \"id\" : 6,    \"iconUrl\" : \"iconUrl\",    \"shadowSize\" : [ 5, 5 ]  },  \"id\" : 0}", SimpleIconRender.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<SimpleIconRender>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<SimpleIconRender>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<SimpleIconRender>> getSimpleIconRenders(@ApiParam(value = "用户登录成功后的Token" ,required=true) @RequestHeader(value="authoration", required=true) String authoration) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<SimpleIconRender>>(objectMapper.readValue("[ {  \"symbol\" : {    \"popupAnchor\" : [ 7, 7 ],    \"shadowAnchor\" : [ 2, 2 ],    \"iconAnchor\" : [ 5, 5 ],    \"shadowUrl\" : \"shadowUrl\",    \"iconSize\" : [ 1, 1 ],    \"id\" : 6,    \"iconUrl\" : \"iconUrl\",    \"shadowSize\" : [ 5, 5 ]  },  \"id\" : 0}, {  \"symbol\" : {    \"popupAnchor\" : [ 7, 7 ],    \"shadowAnchor\" : [ 2, 2 ],    \"iconAnchor\" : [ 5, 5 ],    \"shadowUrl\" : \"shadowUrl\",    \"iconSize\" : [ 1, 1 ],    \"id\" : 6,    \"iconUrl\" : \"iconUrl\",    \"shadowSize\" : [ 5, 5 ]  },  \"id\" : 0} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<SimpleIconRender>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<SimpleIconRender>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<SimplePathRender> getSimplePathRender(@ApiParam(value = "用户登录成功后的Token" ,required=true) @RequestHeader(value="authoration", required=true) String authoration,@ApiParam(value = "",required=true) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<SimplePathRender>(objectMapper.readValue("{  \"symbol\" : {    \"color\" : \"color\",    \"weight\" : 5,    \"fill\" : true,    \"stroke\" : true,    \"line-join\" : \"miter\",    \"dash-array\" : \"dash-array\",    \"id\" : 6,    \"radius\" : 1,    \"opacity\" : 5.63737665663332876420099637471139430999755859375,    \"fill-color\" : \"null\",    \"fill-opacity\" : 2.3021358869347654518833223846741020679473876953125,    \"fill-rule\" : \"nonzero\",    \"line-cap\" : \"butt\",    \"dash-offset\" : \"dash-offset\"  },  \"id\" : 0}", SimplePathRender.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<SimplePathRender>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<SimplePathRender>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<SimplePathRender>> getSimplePathRenders(@ApiParam(value = "用户登录成功后的Token" ,required=true) @RequestHeader(value="authoration", required=true) String authoration) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<SimplePathRender>>(objectMapper.readValue("[ {  \"symbol\" : {    \"color\" : \"color\",    \"weight\" : 5,    \"fill\" : true,    \"stroke\" : true,    \"line-join\" : \"miter\",    \"dash-array\" : \"dash-array\",    \"id\" : 6,    \"radius\" : 1,    \"opacity\" : 5.63737665663332876420099637471139430999755859375,    \"fill-color\" : \"null\",    \"fill-opacity\" : 2.3021358869347654518833223846741020679473876953125,    \"fill-rule\" : \"nonzero\",    \"line-cap\" : \"butt\",    \"dash-offset\" : \"dash-offset\"  },  \"id\" : 0}, {  \"symbol\" : {    \"color\" : \"color\",    \"weight\" : 5,    \"fill\" : true,    \"stroke\" : true,    \"line-join\" : \"miter\",    \"dash-array\" : \"dash-array\",    \"id\" : 6,    \"radius\" : 1,    \"opacity\" : 5.63737665663332876420099637471139430999755859375,    \"fill-color\" : \"null\",    \"fill-opacity\" : 2.3021358869347654518833223846741020679473876953125,    \"fill-rule\" : \"nonzero\",    \"line-cap\" : \"butt\",    \"dash-offset\" : \"dash-offset\"  },  \"id\" : 0} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<SimplePathRender>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<SimplePathRender>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<UniqueIconRender> getUniqueIconRender(@ApiParam(value = "用户登录成功后的Token" ,required=true) @RequestHeader(value="authoration", required=true) String authoration,@ApiParam(value = "",required=true) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<UniqueIconRender>(objectMapper.readValue("{  \"property\" : \"property\",  \"id\" : 0,  \"symbols\" : [ {    \"icon\" : {      \"popupAnchor\" : [ 7, 7 ],      \"shadowAnchor\" : [ 2, 2 ],      \"iconAnchor\" : [ 5, 5 ],      \"shadowUrl\" : \"shadowUrl\",      \"iconSize\" : [ 1, 1 ],      \"id\" : 6,      \"iconUrl\" : \"iconUrl\",      \"shadowSize\" : [ 5, 5 ]    },    \"key\" : \"key\"  }, {    \"icon\" : {      \"popupAnchor\" : [ 7, 7 ],      \"shadowAnchor\" : [ 2, 2 ],      \"iconAnchor\" : [ 5, 5 ],      \"shadowUrl\" : \"shadowUrl\",      \"iconSize\" : [ 1, 1 ],      \"id\" : 6,      \"iconUrl\" : \"iconUrl\",      \"shadowSize\" : [ 5, 5 ]    },    \"key\" : \"key\"  } ]}", UniqueIconRender.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<UniqueIconRender>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<UniqueIconRender>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<UniqueIconRender>> getUniqueIconRenders(@ApiParam(value = "用户登录成功后的Token" ,required=true) @RequestHeader(value="authoration", required=true) String authoration) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<UniqueIconRender>>(objectMapper.readValue("[ {  \"property\" : \"property\",  \"id\" : 0,  \"symbols\" : [ {    \"icon\" : {      \"popupAnchor\" : [ 7, 7 ],      \"shadowAnchor\" : [ 2, 2 ],      \"iconAnchor\" : [ 5, 5 ],      \"shadowUrl\" : \"shadowUrl\",      \"iconSize\" : [ 1, 1 ],      \"id\" : 6,      \"iconUrl\" : \"iconUrl\",      \"shadowSize\" : [ 5, 5 ]    },    \"key\" : \"key\"  }, {    \"icon\" : {      \"popupAnchor\" : [ 7, 7 ],      \"shadowAnchor\" : [ 2, 2 ],      \"iconAnchor\" : [ 5, 5 ],      \"shadowUrl\" : \"shadowUrl\",      \"iconSize\" : [ 1, 1 ],      \"id\" : 6,      \"iconUrl\" : \"iconUrl\",      \"shadowSize\" : [ 5, 5 ]    },    \"key\" : \"key\"  } ]}, {  \"property\" : \"property\",  \"id\" : 0,  \"symbols\" : [ {    \"icon\" : {      \"popupAnchor\" : [ 7, 7 ],      \"shadowAnchor\" : [ 2, 2 ],      \"iconAnchor\" : [ 5, 5 ],      \"shadowUrl\" : \"shadowUrl\",      \"iconSize\" : [ 1, 1 ],      \"id\" : 6,      \"iconUrl\" : \"iconUrl\",      \"shadowSize\" : [ 5, 5 ]    },    \"key\" : \"key\"  }, {    \"icon\" : {      \"popupAnchor\" : [ 7, 7 ],      \"shadowAnchor\" : [ 2, 2 ],      \"iconAnchor\" : [ 5, 5 ],      \"shadowUrl\" : \"shadowUrl\",      \"iconSize\" : [ 1, 1 ],      \"id\" : 6,      \"iconUrl\" : \"iconUrl\",      \"shadowSize\" : [ 5, 5 ]    },    \"key\" : \"key\"  } ]} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<UniqueIconRender>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<UniqueIconRender>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<UniquePathRender> getUniquePathRender(@ApiParam(value = "用户登录成功后的Token" ,required=true) @RequestHeader(value="authoration", required=true) String authoration,@ApiParam(value = "",required=true) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<UniquePathRender>(objectMapper.readValue("{  \"property\" : \"property\",  \"id\" : 0,  \"symbols\" : [ {    \"icon\" : {      \"color\" : \"color\",      \"weight\" : 5,      \"fill\" : true,      \"stroke\" : true,      \"line-join\" : \"miter\",      \"dash-array\" : \"dash-array\",      \"id\" : 6,      \"radius\" : 1,      \"opacity\" : 5.63737665663332876420099637471139430999755859375,      \"fill-color\" : \"null\",      \"fill-opacity\" : 2.3021358869347654518833223846741020679473876953125,      \"fill-rule\" : \"nonzero\",      \"line-cap\" : \"butt\",      \"dash-offset\" : \"dash-offset\"    },    \"key\" : \"key\"  }, {    \"icon\" : {      \"color\" : \"color\",      \"weight\" : 5,      \"fill\" : true,      \"stroke\" : true,      \"line-join\" : \"miter\",      \"dash-array\" : \"dash-array\",      \"id\" : 6,      \"radius\" : 1,      \"opacity\" : 5.63737665663332876420099637471139430999755859375,      \"fill-color\" : \"null\",      \"fill-opacity\" : 2.3021358869347654518833223846741020679473876953125,      \"fill-rule\" : \"nonzero\",      \"line-cap\" : \"butt\",      \"dash-offset\" : \"dash-offset\"    },    \"key\" : \"key\"  } ]}", UniquePathRender.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<UniquePathRender>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<UniquePathRender>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<UniquePathRender>> getUniquePathRenders(@ApiParam(value = "用户登录成功后的Token" ,required=true) @RequestHeader(value="authoration", required=true) String authoration) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<UniquePathRender>>(objectMapper.readValue("[ {  \"property\" : \"property\",  \"id\" : 0,  \"symbols\" : [ {    \"icon\" : {      \"color\" : \"color\",      \"weight\" : 5,      \"fill\" : true,      \"stroke\" : true,      \"line-join\" : \"miter\",      \"dash-array\" : \"dash-array\",      \"id\" : 6,      \"radius\" : 1,      \"opacity\" : 5.63737665663332876420099637471139430999755859375,      \"fill-color\" : \"null\",      \"fill-opacity\" : 2.3021358869347654518833223846741020679473876953125,      \"fill-rule\" : \"nonzero\",      \"line-cap\" : \"butt\",      \"dash-offset\" : \"dash-offset\"    },    \"key\" : \"key\"  }, {    \"icon\" : {      \"color\" : \"color\",      \"weight\" : 5,      \"fill\" : true,      \"stroke\" : true,      \"line-join\" : \"miter\",      \"dash-array\" : \"dash-array\",      \"id\" : 6,      \"radius\" : 1,      \"opacity\" : 5.63737665663332876420099637471139430999755859375,      \"fill-color\" : \"null\",      \"fill-opacity\" : 2.3021358869347654518833223846741020679473876953125,      \"fill-rule\" : \"nonzero\",      \"line-cap\" : \"butt\",      \"dash-offset\" : \"dash-offset\"    },    \"key\" : \"key\"  } ]}, {  \"property\" : \"property\",  \"id\" : 0,  \"symbols\" : [ {    \"icon\" : {      \"color\" : \"color\",      \"weight\" : 5,      \"fill\" : true,      \"stroke\" : true,      \"line-join\" : \"miter\",      \"dash-array\" : \"dash-array\",      \"id\" : 6,      \"radius\" : 1,      \"opacity\" : 5.63737665663332876420099637471139430999755859375,      \"fill-color\" : \"null\",      \"fill-opacity\" : 2.3021358869347654518833223846741020679473876953125,      \"fill-rule\" : \"nonzero\",      \"line-cap\" : \"butt\",      \"dash-offset\" : \"dash-offset\"    },    \"key\" : \"key\"  }, {    \"icon\" : {      \"color\" : \"color\",      \"weight\" : 5,      \"fill\" : true,      \"stroke\" : true,      \"line-join\" : \"miter\",      \"dash-array\" : \"dash-array\",      \"id\" : 6,      \"radius\" : 1,      \"opacity\" : 5.63737665663332876420099637471139430999755859375,      \"fill-color\" : \"null\",      \"fill-opacity\" : 2.3021358869347654518833223846741020679473876953125,      \"fill-rule\" : \"nonzero\",      \"line-cap\" : \"butt\",      \"dash-offset\" : \"dash-offset\"    },    \"key\" : \"key\"  } ]} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<UniquePathRender>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<UniquePathRender>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<SimpleIconRender> updateSimpleIconRender(@ApiParam(value = "用户登录成功后的Token" ,required=true) @RequestHeader(value="authoration", required=true) String authoration,@ApiParam(value = "" ,required=true )  @Valid @RequestBody SimpleIconRender render) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<SimpleIconRender>(objectMapper.readValue("{  \"symbol\" : {    \"popupAnchor\" : [ 7, 7 ],    \"shadowAnchor\" : [ 2, 2 ],    \"iconAnchor\" : [ 5, 5 ],    \"shadowUrl\" : \"shadowUrl\",    \"iconSize\" : [ 1, 1 ],    \"id\" : 6,    \"iconUrl\" : \"iconUrl\",    \"shadowSize\" : [ 5, 5 ]  },  \"id\" : 0}", SimpleIconRender.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<SimpleIconRender>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<SimpleIconRender>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<SimplePathRender> updateSimplePathRender(@ApiParam(value = "用户登录成功后的Token" ,required=true) @RequestHeader(value="authoration", required=true) String authoration,@ApiParam(value = "" ,required=true )  @Valid @RequestBody SimplePathRender render) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<SimplePathRender>(objectMapper.readValue("{  \"symbol\" : {    \"color\" : \"color\",    \"weight\" : 5,    \"fill\" : true,    \"stroke\" : true,    \"line-join\" : \"miter\",    \"dash-array\" : \"dash-array\",    \"id\" : 6,    \"radius\" : 1,    \"opacity\" : 5.63737665663332876420099637471139430999755859375,    \"fill-color\" : \"null\",    \"fill-opacity\" : 2.3021358869347654518833223846741020679473876953125,    \"fill-rule\" : \"nonzero\",    \"line-cap\" : \"butt\",    \"dash-offset\" : \"dash-offset\"  },  \"id\" : 0}", SimplePathRender.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<SimplePathRender>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<SimplePathRender>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<UniqueIconRender> updateUniqueIconRender(@ApiParam(value = "用户登录成功后的Token" ,required=true) @RequestHeader(value="authoration", required=true) String authoration,@ApiParam(value = "" ,required=true )  @Valid @RequestBody UniqueIconRender render) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<UniqueIconRender>(objectMapper.readValue("{  \"property\" : \"property\",  \"id\" : 0,  \"symbols\" : [ {    \"icon\" : {      \"popupAnchor\" : [ 7, 7 ],      \"shadowAnchor\" : [ 2, 2 ],      \"iconAnchor\" : [ 5, 5 ],      \"shadowUrl\" : \"shadowUrl\",      \"iconSize\" : [ 1, 1 ],      \"id\" : 6,      \"iconUrl\" : \"iconUrl\",      \"shadowSize\" : [ 5, 5 ]    },    \"key\" : \"key\"  }, {    \"icon\" : {      \"popupAnchor\" : [ 7, 7 ],      \"shadowAnchor\" : [ 2, 2 ],      \"iconAnchor\" : [ 5, 5 ],      \"shadowUrl\" : \"shadowUrl\",      \"iconSize\" : [ 1, 1 ],      \"id\" : 6,      \"iconUrl\" : \"iconUrl\",      \"shadowSize\" : [ 5, 5 ]    },    \"key\" : \"key\"  } ]}", UniqueIconRender.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<UniqueIconRender>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<UniqueIconRender>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<UniquePathRender> updateUniquePathRender(@ApiParam(value = "用户登录成功后的Token" ,required=true) @RequestHeader(value="authoration", required=true) String authoration,@ApiParam(value = "" ,required=true )  @Valid @RequestBody UniquePathRender render) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<UniquePathRender>(objectMapper.readValue("{  \"property\" : \"property\",  \"id\" : 0,  \"symbols\" : [ {    \"icon\" : {      \"color\" : \"color\",      \"weight\" : 5,      \"fill\" : true,      \"stroke\" : true,      \"line-join\" : \"miter\",      \"dash-array\" : \"dash-array\",      \"id\" : 6,      \"radius\" : 1,      \"opacity\" : 5.63737665663332876420099637471139430999755859375,      \"fill-color\" : \"null\",      \"fill-opacity\" : 2.3021358869347654518833223846741020679473876953125,      \"fill-rule\" : \"nonzero\",      \"line-cap\" : \"butt\",      \"dash-offset\" : \"dash-offset\"    },    \"key\" : \"key\"  }, {    \"icon\" : {      \"color\" : \"color\",      \"weight\" : 5,      \"fill\" : true,      \"stroke\" : true,      \"line-join\" : \"miter\",      \"dash-array\" : \"dash-array\",      \"id\" : 6,      \"radius\" : 1,      \"opacity\" : 5.63737665663332876420099637471139430999755859375,      \"fill-color\" : \"null\",      \"fill-opacity\" : 2.3021358869347654518833223846741020679473876953125,      \"fill-rule\" : \"nonzero\",      \"line-cap\" : \"butt\",      \"dash-offset\" : \"dash-offset\"    },    \"key\" : \"key\"  } ]}", UniquePathRender.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<UniquePathRender>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<UniquePathRender>(HttpStatus.NOT_IMPLEMENTED);
    }

}
