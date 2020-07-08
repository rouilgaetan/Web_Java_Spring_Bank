document.addEventListener("DOMContentLoaded", function() { 
    if(document.querySelector("#pro")!==null){
        if(document.querySelector("#particulier")!==null){
            if(document.querySelector("#divPro")!==null){
                document.querySelector("#divPro").style.display="none";
                var radio_pro = document.querySelector("#pro");
                var radio_part = document.querySelector("#particulier");
                radio_pro.addEventListener('click', function(){
                    document.querySelector("#divPro").style.display="block";
                });
                radio_part.addEventListener('click', function(){
                    document.querySelector("#divPro").style.display="none";
                });
            }
        }
    }
});