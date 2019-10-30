function request(){
   
    const Http = new XMLHttpRequest();
    const url='http://localhost:9002/volunteerapp/volunteer';
    
    Http.open("POST", url,true);
    Http.setRequestHeader("Content-Type", "application/json");
    
    const fd = {
      'orgname': document.getElementById("orgname").value,
      'aboutorg': document.getElementById("aboutorg").value,
      'location': document.getElementById("location").value,
      'skillset': document.getElementById("skillset").value,
      'areaofwork' : document.getElementById("areaofwork").value,
      'weblink' : document.getElementById("areaofwork").value
    };
  
    Http.onreadystatechange = function(ev) {
        console.log("testinf 1234");
    }	  

    Http.send(JSON.stringify(fd));
    }