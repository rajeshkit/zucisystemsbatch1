function demo(){
    var x1 = document.getElementById("p1");
    console.log(x1);
    x1.textContent="Rajesh N"
    
const xhttp = new XMLHttpRequest();
xhttp.onreadystatechange = function() {
  if (this.readyState == 4 && this.status == 200) {
    //document.getElementById("demo").innerHTML =
    let cafeteria = JSON.parse(this.response);
     var trow=document.getElementById("trow");  
    for (const cafe of cafeteria) {
            var tr=document.createElement("tr");
            console.log(cafe);
            for (const key in cafe) {
               var td= document.createElement('td');
               td.textContent=cafe[key];
               tr.appendChild(td);
            }
            trow.appendChild(tr);

    }        
    
  }
};

xhttp.open("GET", "http://localhost:9090/cafeteria");
xhttp.send();
}
function registerCafeteria(e){
    e.preventDefault();
   console.log(e.target.cafeteriaId.value);
   console.log(e.target.cafeteriaName.value);
   console.log(e.target.cafeteriaCost.value);
   console.log(e.target.cafeteriaDoe.value);
 
}
