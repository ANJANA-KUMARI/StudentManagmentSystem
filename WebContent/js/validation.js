function validateForm() {
    var x = document.forms["studentForm"]["firstName"]["lastName"]["birthday"]["email"]["phone"]["city"]["state"]["zip"]["roll"].value;
    if (x == "") {
      alert("Must be filled out");
      return false;
    }
  }

  function validateForm() {
    var x = document.forms["teacherForm"]["firstName"]["lastName"]["birthday"]["email"]["password"]["repeatPassword"]["phone"]["city"]["state"]["zip"].value;
    if (x == "") {
      alert("Must be filled out");
      return false;
    }
  }

  function validateForm() {
    var x = document.forms["subjectForm"]["subjectName"]["section"].value;
    if (x == "") {
      alert("Must be filled out");
      return false;
    }
  }

  function validateForm() {
    var x = document.forms["examForm"]["examName"].value;
    if (x == "") {
      alert("Must be filled out");
      return false;
    }
  }
