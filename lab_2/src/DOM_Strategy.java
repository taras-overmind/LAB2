import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class DOM_Strategy implements IStrategy {
    @Override
    public List<Teacher> parse(String search, File filepath) {
        List<Teacher> res = new ArrayList<>();
        try{
            System.out.println("DOM");
            DOM_Search dom = new DOM_Search();
            res = dom.convert(search, filepath);
        }catch(Exception ex){
            System.out.println("Error");
        }
        return res;
    }
}
