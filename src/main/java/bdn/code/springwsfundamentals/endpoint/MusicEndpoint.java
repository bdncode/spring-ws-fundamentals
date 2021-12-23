package bdn.code.springwsfundamentals.endpoint;

import bdn.code.springwsfundamentals.model.GetAlbumRequest;
import bdn.code.springwsfundamentals.model.GetAlbumResponse;
import bdn.code.springwsfundamentals.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class MusicEndpoint {

    public static final String TARGET_NAMESPACE = "http://code.bdn/springwsfundamentals/model";
    @Autowired
    private MusicService musicService;

    @PayloadRoot(namespace = TARGET_NAMESPACE, localPart = "GetAlbumRequest")
    @ResponsePayload
    public GetAlbumResponse getUserRequest(@RequestPayload GetAlbumRequest request) {

        GetAlbumResponse response = new GetAlbumResponse();
        response.setAlbum(musicService.getAlbums(request.getName()));
        return response;
    }
}
