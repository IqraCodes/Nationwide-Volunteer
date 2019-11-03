// GET

function getrequest(){
   
    const Http = new XMLHttpRequest();
    const url='http://localhost:9002/volunteerapp/volunteer';
    
    Http.open("GET", url,true);

  
    Http.onreadystatechange = function(ev) {
        if (Http.readyState == 4){
    
            data = JSON.parse(Http.responseText);
            var table = document.getElementById("volunteertable");

            while (table.hasChildNodes()){
                table.removeChild(table.firstChild);
            }
            
            
            data.forEach(function(volunteer){

                console.log(volunteer)
                
                var newrow = document.createElement("tr");
                newrow.setAttribute("id", volunteer.id);
                var namelist = newrow.appendChild(document.createElement('td'));
                namelist.setAttribute("id", "nametable");
                namelist.setAttribute("contenteditable", "true");
                var aboutorglist = newrow.appendChild(document.createElement('td'));
                aboutorglist.setAttribute("contenteditable", "true");
                aboutorglist.setAttribute("id", "aboutorgtable");
                var locationlist = newrow.appendChild(document.createElement('td'));
                locationlist.setAttribute("contenteditable", "true");
                locationlist.setAttribute("id", "locationtable");
                var skillsetlist = newrow.appendChild(document.createElement('td'));
                skillsetlist.setAttribute("contenteditable", "true");
                skillsetlist.setAttribute("id", "skillsettable");
                var areaofworklist = newrow.appendChild(document.createElement('td'));
                areaofworklist.setAttribute("contenteditable", "true");
                areaofworklist.setAttribute("id", "areaofworktable");
                var weblinklist = newrow.appendChild(document.createElement('td'));
                weblinklist.setAttribute("contenteditable", "true");
                weblinklist.setAttribute("id", "weblinktable");

                
                

                var updatedTd = newrow.appendChild(document.createElement('td'));
                var deleteTd = newrow.appendChild(document.createElement('td'));
                var updateButton = document.createElement('input');
                var deleteButton = document.createElement('input');
                updateButton.type="button";
                updateButton.value="Update";
                deleteButton.type="button";
                deleteButton.value="Delete";


                deleteButton.onclick = function (){
                    deleterequest(volunteer.id);
                }

                updateButton.onclick = function (){
                    updaterequest(volunteer.id);
               
                    
                }

    
                namelist.innerHTML = volunteer.orgname;
                aboutorglist.innerHTML = volunteer.aboutorg;
                locationlist.innerHTML = volunteer.location;
                skillsetlist.innerHTML = volunteer.skillset;
                areaofworklist.innerHTML = volunteer.areaofwork;
                weblinklist.innerHTML = volunteer.weblink;
                
                updatedTd.appendChild(updateButton);
                deleteTd.appendChild(deleteButton);

                table.appendChild(newrow);


           
            });
        
        }}
    	Http.send();
    }

// POST

function postrequest(){

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
      'weblink' : document.getElementById("weblink").value
    };
  
    Http.onreadystatechange = function(ev) {
       
    }	  

    Http.send(JSON.stringify(fd));
    }

    // UPDATE 

   function updaterequest(id){
	   
	var row = document.getElementById(id).getElementsByTagName('td');
	console.log(row);
	
	console.log(row.namedItem('weblinktable').textContent);
    

    const Http = new XMLHttpRequest();
    const url='http://localhost:9002/volunteerapp/volunteer';
    
    Http.open("PUT", url,true);
    Http.setRequestHeader("Content-Type", "application/json");

    const fd = {
    	'id': id,
        'orgname': row.namedItem('nametable').textContent,
        'aboutorg': row.namedItem('aboutorgtable').textContent,
        'location': row.namedItem('locationtable').textContent,
        'skillset': row.namedItem('skillsettable').textContent,
        'areaofwork' : row.namedItem('areaofworktable').textContent,
        'weblink' : row.namedItem('weblinktable').textContent,

      };
  
    Http.onreadystatechange = function(ev) {
        console.log("testinf 1234");

        
    }	  

    Http.send(JSON.stringify(fd));
    

    }

        // DELETE

        function deleterequest(id) {
            const Http = new XMLHttpRequest();
            const url='http://localhost:9002/volunteerapp/volunteer/'+id;

            Http.open("DELETE", url);
            Http.onreadystatechange = function (event) {
                if (Http.readyState == 4) {
                    getrequest();
                }
            }
            Http.send();
            
        }