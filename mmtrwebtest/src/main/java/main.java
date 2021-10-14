import io.javalin.Javalin;
import io.javalin.plugin.json.JavalinJson;
import netscape.javascript.JSObject;

public class main {
    public static void main(String args[]) {

        Javalin App = Javalin.create().start(7000);
        App.get("/ff", ctx ->{
            String Name = ctx.queryParam("name");
            String Color = ctx.queryParam("color");
            String Age = ctx.queryParam("age");
            String radioMorning = ctx.queryParam("radiomorning");
            String radioEvening = ctx.queryParam("radioevening");
            String radioNight = ctx.queryParam("radionight");
            String тimeOfDay = "";
            if((Name.length()!=0 )&& (radioEvening.equals("true")|| radioMorning.equals("true") || radioNight.equals("true"))){
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
                if(Age.equals("true")){
                    Age="yes";
                }
                else {
                    Age="no";
                }
                ctx.result(Name+"/"+Color+"/"+Age+"/"+тimeOfDay);
            }
            else {
                ctx.result("-1");
            }
        });

    }
}
