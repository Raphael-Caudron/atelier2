
var xhr = new XMLHttpRequest();
var url = "header.html";
xhr.open("GET", url, true);

xhr.onload = function() {
  if (xhr.status === 200) {
    var headerContent = xhr.responseText;
    var headerElement = document.getElementById("header");
    headerElement.innerHTML = headerContent;
  }
};
xhr.send();