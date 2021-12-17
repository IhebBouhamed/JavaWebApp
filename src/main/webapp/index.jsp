<html>
<body>

<center>
    <h2>Gestionnaire des Patients</h2>
    <h5>Crée par Iheb Bouhamed </h5>
   
    
    
    <p><a href="webapi/myresource">Afficher la Liste des Patient</a>
    
    <form action="webapi/myresource/ajout?num=1000&nom=IHEBEDDIn&prenom=bbbb&heure=8522" method="POST">
   
    <input type="text" placeholder="Numero du patient" id="numPat" name="numId">
    <input type="text" placeholder="Nom  du patient"id="nomPat" name="nomId">
    <input type="text" placeholder="Prenom  du patient"id="prenomPat" name="prenomId">
    <input type="text" placeholder="Heure rendezvous du patient"id="heurePat" name="heureId">
   
    <input type="submit" value="Ajouter le patient">
    </form>

    
    
    </center>
    <script>
    
    //Ajout d'un patient
document.querySelector('form').onsubmit = function() {
  this.setAttribute('action', "webapi/myresource/ajout?num=" + document.querySelector('input[name=numId]').value + "&nom="+document.querySelector('input[name=nomId]').value +"&prenom="+ document.querySelector('input[name=prenomId]').value +"&heure="+document.querySelector('input[name=heureId]').value )
	alert("Patient Ajouté sans controle de saisie");
}
   

    </script>
</body>
</html>
