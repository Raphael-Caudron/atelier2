// Créez un objet XMLHttpRequest
var xhr = new XMLHttpRequest();

// Définissez l'URL du fichier d'en-tête à charger
var url = "header.html";
// Ouvrez une requête GET asynchrone pour charger le fichier d'en-tête
xhr.open("GET", url, true);

// Configurez le gestionnaire d'événements de chargement de la requête
xhr.onload = function() {
  // Vérifiez que la requête a réussi
  if (xhr.status === 200) {
    // Récupérez le contenu du fichier d'en-tête
    var headerContent = xhr.responseText;

    // Ajoutez le contenu de l'en-tête à l'élément de l'en-tête sur la page
    var headerElement = document.getElementById("header");
    headerElement.innerHTML = headerContent;
  }
};

// Envoyez la requête pour charger le fichier d'en-tête
xhr.send();