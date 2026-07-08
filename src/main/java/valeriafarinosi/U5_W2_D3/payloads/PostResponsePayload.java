package valeriafarinosi.U5_W2_D3.payloads;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class PostResponsePayload {
    //    contains only the attributes that will be present in the JSON
//    we send back to the client
    private int postId;


}
