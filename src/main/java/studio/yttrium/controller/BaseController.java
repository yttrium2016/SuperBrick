package studio.yttrium.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import studio.yttrium.utils.JacksonUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA
 * Created By 杨振宇
 * Date: 2017/7/5
 * Time: 17:07
 */
@Controller
public class BaseController {


    @RequestMapping("hello")
    public String hello() {
        return "a1";
    }

    @RequestMapping("hello1")
    public String hello1() {
        return "/common/a1";
    }

    @RequestMapping("hello2")
    @ResponseBody
    public String hello2() {
        return "a1是個返回界面";
    }

    @RequestMapping("hello3")
    @ResponseBody
    public Map<?, ?> hello3() throws Exception {
        Map map = new HashMap();
        for (int i = 0; i < 56; i++) {
            map.put("name" + i, "用戶名:yzy");
            map.put("age" + i, 5);
            map.put("password" + i, "*****sadaad**");
        }

        String json = JacksonUtils.obj2json(map);

        return JacksonUtils.json2map(json);
    }

    @RequestMapping("hello4")
    public String hello4() {
        return "hello4";
    }

    @RequestMapping("hello5")
    @ResponseBody
    public String hello5(HttpServletRequest request) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        Map<String, String[]> parameterMap = request.getParameterMap();

        String[] a = {};
        for (Map.Entry<String, String[]> entry : parameterMap.entrySet()) {
            //Map.entry<Integer,String> 映射项（键-值对）  有几个方法：用上面的名字entry
            //entry.getKey() ;entry.getValue(); entry.setValue();
            //map.entrySet()  返回此映射中包含的映射关系的 Set视图。
            a = entry.getValue();
            for (int i = 0; i < a.length; i++) {
                System.out.println("key= " + entry.getKey() + " and value= "
                        + a[i]);
            }

        }

        Map map = new HashMap();
        for (int i = 0; i < 56; i++) {
            map.put("name" + i, "用戶名:yzy");
            map.put("age" + i, 5);
            map.put("password" + i, "*****sadaad**");
        }

        return JacksonUtils.obj2json(map);
    }

    @RequestMapping("button")
    public String button() {
        return "button";
    }
}
