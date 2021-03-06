package com.ssafy.api.response;
import com.ssafy.common.model.response.BaseResponseBody;
import com.ssafy.db.entity.Room;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.http.HttpStatus;


import lombok.Getter;
import lombok.Setter;

/**
 * 서버 요청에대한 기본 응답값(바디) 정의.
 */
@Getter
@Setter
@ApiModel("RoomCreatePostRes")
public class RoomCreatePostRes extends BaseResponseBody {
    @ApiModelProperty(name="openVidu 인증 토큰", example="eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ0ZXN...")
    String roomToken; //필수 값

    public static RoomCreatePostRes of(Integer statusCode, String message, String roomToken) {
        RoomCreatePostRes res = new RoomCreatePostRes();
        res.setStatusCode(statusCode);
        res.setMessage(message);
        res.setRoomToken(roomToken);
        return res;
    }
}
