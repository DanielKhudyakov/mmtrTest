let xhttp=new XMLHttpRequest();
function alerted(){
    var name=document.getElementById("name").value;
    var color =document.getElementById("color").value;
    var age=document.getElementById("18-years").checked;
    var radio_morning=document.getElementById("radio-morning").checked;
    var radio_evening=document.getElementById("radio-evening").checked;
    var radio_night=document.getElementById("radio-night").checked;
xhttp.onreadystatechange=function(){
    if(this.readyState==4 && this.status==200){
        myFunction(this.responseText);

    }
}
xhttp.open("GET","http://localhost:7000/ff?name=" + name+"&color="+color+"&age="+age+"&radiomorning="+radio_morning+"&radioevening="+radio_evening+"&radionight="+radio_evening,true);
xhttp.send();
function myFunction(data){
    console.log(data);
    if(data=="-1"){
        document.write("Data entry error")
    }
    else{
        var result =data.split('/');
        document.write("Your name: "+result[0]+"<br>");
        document.write("Your favouritecolor: "+result[1]+"<br>");
        document.write("You are older than 18 years: "+result[2]+"<br>");
        document.write("Your favourite time of day: "+result[3]+"<br>");

    }
}
}
