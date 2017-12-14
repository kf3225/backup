for(var p = 0; p < 10; p++){
    for(var q = 0; q < 20; q++){
        if(q % 2 == 0){
            document.write("-");
        }else{
            document.write("|");
        }
        if(p == q){
            document.write("<br>");
            break;
        }
    }
}

document.write("<br>");

for(var num1 = 1; num1 <= 9; num1++){
    document.write(num1 + "の段:");
    for(var num2 = 1; num2 <= 9; num2++){
        document.write(num1 * num2 + "&nbsp;&nbsp;&nbsp;");
    }
    document.write("<br>");
}

document.write("<br>");

function x(r, p = 3.14){
    return r * r * p;
}

document.write(x(5) + "<br>");
document.write(x(7) + "<br>");
document.write(x(9) + "<br>");

function groupTotal(a, c, a_v = 500, c_v = 200){
    return a_v * a + c_v * c;
}

document.write(groupTotal(2,4) + "円です<br>");
document.write(groupTotal(1,5) + "円です<br>");
document.write(groupTotal(3,7) + "円です<br>");

document.write("<br>");

for(var a = 0; a < 5; a++){
    for(var b = 0; b < 5; b++){
        document.write("★");
    }
    document.write("<br>");
}

document.write("<br>");

var c = 1;
while(c <= 25){
    if(c % 2 == 0){
        document.write("★");
    }
    else{
        document.write("☆")
    }
    if(c % 5 == 0){
        document.write("<br>");
    }
    c++;
}

document.write("<br>");

var d = 1;
while(d <= 25){
    if((d - 1) % 6 == 0){
        document.write("☆")
    }else{
        document.write("★")
    }
    if(d % 5 == 0){
        document.write("<br>")
    }
    d++;
}

for(var e = 0; e <= 5; e++){
    for(var f = 0; f <= 5; f++){
        document.write("★");
    if(e == f){
        document.write("<br>");
        break;
    }
    }
}

document.write("<br>");

for(var g = 1; g <= 5; g++){
    for(var h = 1; h <= 5; h++){
        if(g == h){
            document.write("☆");
            break;
        }else{
            document.write("★");
        }
    }
    document.write("<br>");
}