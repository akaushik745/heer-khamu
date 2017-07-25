var jsonfile = require('jsonfile')
 
var file = 'firebase.json'
var obj = {"firebase": "bsqa-1",
	  "public": "target/site/serenity/",
	  "ignore": [
	    "firebase.json",
	    "**/.*",
	    "**/node_modules/**"
	    
	  ]
}
 
jsonfile.writeFile(file, obj, function (err) {
  console.error(err)
})