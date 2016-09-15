function controls(){
    return{
        table   : document.getElementById("mainTable"),
    };
}

function buildEmployees(){
   
    var empList = lookUpData().employees;
    rowNumber = 1;
    
    var firstRow = controls().table.insertRow(0);
    fields = Object.getOwnPropertyNames(empList[0]);
    
    firstRow.insertCell(0).innerHTML = "Serial Number";
    
    for(var i=0;i<fields.length;i++){
        firstRow.insertCell(i+1).innerHTML = fields[i];
    }
    
    for(var i=0;i<empList.length;i++){
      eachEmployee(empList[i]);
    }
}

function eachEmployee(employee){
    
    var row = controls().table.insertRow(rowNumber);
    
    row.insertCell(0).innerHTML = rowNumber;
     
    for(var i=0;i<fields.length;i++){
        row.insertCell(i+1).innerHTML = employee[fields[i]];
    }
    
    rowNumber++;
}

function init(){
    buildEmployees();
}

init();