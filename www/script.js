for(var i=1; i<=5; i++){
    for(var j=1; j<=5; j++){
        document.write("★");
    }
    document.write("<br>");
}

document.write("<br>");

var k=1;

while(k<=25){
    if(k%2==0){
        document.write("☆");
    }else{
        document.write("★");
    }
    if(k%5==0){
        document.write("<br>");
    }
    k++;
}

document.write("<br>");

for(var l=1; l<=5; l++){
    for(var m=1; m<=5; m++){
        if((l+m)%2==0){
            document.write("☆");
        }else{
            document.write("★");
        }
    }
    document.write("<br>");
}

document.write("<br>");

for(var n=1; n<=5; n++){
    for(var o=1; o<=5; o++){
        if(n==o){
            document.write("★");
            break;
        }else{
            document.write("★");
        }
    }
    document.write("<br>");
}

document.write("<br>");

for(var p=1; p<=5; p++){
    for(var q=1; q<=5; q++){
        if(p==q){
            document.write("☆");
            break;
        }else{
            document.write("★");
        }
    }
    document.write("<br>");
}

document.write("<br>");

function area(r, p=3.14){
    return "面積は"+r*r*p+"cm^2です"
}

document.write(area(5));
document.write("<br>");
document.write(area(7));
document.write("<br>");
document.write(area(10));
document.write("<br>");

document.write("<br>");

function value(group, a, c, a_v=500, c_v=200){
    return group + "グループは合計" + (a_v*a + c_v*c) + "円です"
}

document.write(value("A", 2, 4));
document.write("<br>");
document.write(value("B", 1, 5));
document.write("<br>");
document.write(value("C", 3, 7));
document.write("<br>");

document.write("<br>");