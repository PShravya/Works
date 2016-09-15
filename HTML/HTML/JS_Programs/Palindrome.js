// Program to check given string is palindrome or not

    var string = "NITIN";
    var resultString = "";
    
    for(var i=string.length;i>=0;i--)
        resultString += string.charAt(i);
    
    if(resultString == string)
        console.log("Given string is "+string+" and it is Palindrome");
    else
        console.log("Given string is "+string+" and it is not Palindrome");
