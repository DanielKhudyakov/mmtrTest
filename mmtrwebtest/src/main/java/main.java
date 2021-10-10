import io.javalin.Javalin;
import io.javalin.plugin.json.JavalinJson;
import netscape.javascript.JSObject;

public class main {
    public static void main(String args[]) {

        Javalin app = Javalin.create().start(7000);
        app.get("/ff", ctx ->{
            String name=ctx.queryParam("name");
            String color=ctx.queryParam("color");
            String age=ctx.queryParam("age");
            String radiomorning=ctx.queryParam("radiomorning");
            String radioevening=ctx.queryParam("radioevening");
            String radionight=ctx.queryParam("radionight");
            String time_of_day="";
            if((name.length()!=0 )&& (radioevening.equals("true")|| radiomorning.equals("true") || radionight.equals("true"))){
                if(radioevening.equals("true")){
                    time_of_day="evening";
                }
                else {
                    if (radiomorning.equals("true")) {
                        time_of_day = "morning";
                    } else {
                        time_of_day = "night";
                    }
                }
                if(age.equals("true")){
                    age="yes";
                }
                else {
                    age="no";
                }
                ctx.result(name+"/"+color+"/"+age+"/"+time_of_day);
            }
            else {
                ctx.result("-1");
            }
        });

    }
}
