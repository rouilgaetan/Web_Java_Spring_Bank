function redirectInscription() {
  window.location.href = "inscription.htm";
}

document.addEventListener("DOMContentLoaded", function() { 
    if(document.querySelector("#gauche")!==null){
        if(document.querySelector("#droite")!==null){
            if(document.querySelector("#client")!==null){
                if(document.querySelector("#conseiller")!==null){
                    document.querySelector("#conseiller").style.display="none";
                    var divConseiller = document.querySelector("#droite");
                    var divClient = document.querySelector("#gauche");
                    
                    divConseiller.addEventListener('click', function(){
                        document.querySelector("#conseiller").style.display="block";
                        document.querySelector("#client").style.display="none";
                    });
                    divClient.addEventListener('click', function(){
                        document.querySelector("#conseiller").style.display="none";
                        document.querySelector("#client").style.display="block";
                    });
                }
            }
        }
    }
});