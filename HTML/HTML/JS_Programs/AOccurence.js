// Program to identify the number of occurcences of "A" in the following statement.

    var count = 0;
    var string = "South America, North America, Asia";
    for (var i = 0; i < string.length; i++) {
        if (string.charAt(i) == 'A')
        count++;
    }

    console.log("Number of A in the given statement: " + count);