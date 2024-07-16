package Configs.GameStatService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameStatClient {

    @PostMapping("GetGameDataById")
    public int GetGameDataById(RequestDto request){
        int result = 0;

        if(request.gameRequest == null){
            return result;
        }

        for(int i = 0;i< request.gameRequest.size();i++){
            switch (request.gameRequest.get(i).game){
                case tft -> result +=1;
            }
        }

        return result;
    }
}
