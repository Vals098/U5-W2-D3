package valeriafarinosi.U5_W2_D3.payloads;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import valeriafarinosi.U5_W2_D3.enums.BLOG_CATEGORY;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class PostRequestPayload {

    private BLOG_CATEGORY blogCategory;
    private String title;
    private String content;
    private int readingTime;
    
    private int authorId;


}
