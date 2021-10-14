import io.javalin.Javalin;
import io.javalin.plugin.json.JavalinJson;
import netscape.javascript.JSObject;

public class main {
    public static void main(String args[]) {

        Javalin app = Javalin.create().start(7000);
        app.get("/ff", ctx ->{
            String name = ctx.queryParam("name");
            String color = ctx.queryParam("color");
            String age = ctx.queryParam("age");
            String radioMorning = ctx.queryParam("radiomorning");
            String radioEvening = ctx.queryParam("radioevening");
            String radioNight = ctx.queryParam("radionight");
            String тimeOfDay = "";
            if((name.length()!=0 )&& (radioEvening.equals("true")|| radioMorning.equals("true") || radioNight.equals("true"))){
                if(radioEvening.equals("true")){
                    тimeOfDay="evening";
                }
                else {
                    if (radioMorning.equals("true")) {
                        тimeOfDay = "morning";
                    } else {
                        тimeOfDay = "night";
                    }
                }
                if(age.equals("true")){
                    age="yes";
                }
                else {
                    age="no";
                }
                ctx.result(name+"/"+color+"/"+age+"/"+тimeOfDay);
            }
            else {
                ctx.result("-1");
            }
        });

    }
}
