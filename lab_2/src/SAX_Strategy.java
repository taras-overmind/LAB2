import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class SAX_Strategy implements IStrategy {
    @Override
    public  List<Teacher> parse(String search, File filepath) {
        List<Teacher> res = new ArrayList<>();
        try{
        System.out.println("SAX");
        SAX_Search sax = new SAX_Search();
        res = sax.convert(search, filepath);
        }catch(Exception ex){
            System.out.println("Error");
        }
        return res;
    }
}