function controls(){
    return{
        mainDiv: document.getElementById("registerDiv")
    };
}

function buildDivTag(id){
    var divTag = document.createElement("div");
    
    divTag.id = id;
    
    controls().mainDiv.appendChild(divTag);
}

function buildLabelTag(divId,id,content){   
    var labelTag = document.createElement("label");
    
    labelTag.id = id;
    labelTag.textContent = content;
    
    document.getElementById(divId).appendChild(labelTag);
}

function buildInputTag(divId,id,type){    
    var inputTag = document.createElement("input");
    
    inputTag.id = id;
    inputTag.type = type;
    
    document.getElementById(divId).appendChild(inputTag);
}

function buildLineBreak(id){    
    var lineBreak = document.createElement("br");
    
    document.getElementById(id).appendChild(lineBreak);
}

function buildSelectTag(divId,id){   
    var selectTag = document.createElement("select");
    
    selectTag.id = id;
    
    document.getElementById(divId).appendChild(selectTag);
}

function buildCountries(){
    var countryList = lookUpData().countries;
    
    for(var i=0;i<countryList.length;i++){
        buildOptionTag("country",countryList[i]);
    }
}

function buildOptionTag(id,country){
    var optionTag = document.createElement("option");
    optionTag.value = country.code;
    optionTag.textContent = country.name;
    document.getElementById(id).appendChild(optionTag);
}

function buildRegisterationPage(){
    
    buildDivTag("FirstName");
    buildLabelTag("FirstName","lblFirstName","First Name:");
    buildInputTag("FirstName","txtFirstName","text");
    buildLineBreak("FirstName");
    buildDivTag("LastName");
    buildLabelTag("LastName","lblLastName","Last Name:");
    buildInputTag("LastName","txtLastName","text");
    buildLineBreak("LastName");
    buildDivTag("DropDownList");
    buildLabelTag("DropDownList","lblCountry","Countries:");
    buildSelectTag("DropDownList","country");
    buildCountries();
}

buildRegisterationPage();