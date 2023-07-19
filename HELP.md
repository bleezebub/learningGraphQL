# Getting Started

### Reference Documentation
query{
allCitizens{
firstName
secondName
fatherName
aadharId
}
}


query{
getCitizen(citizenId:1){
firstName
secondName
fatherName
aadharId
}
}


mutation{
createCitizen(citizen: {
firstName:"Monu"
secondName:"Jain"
fatherName:"Kamal"
motherName: "Meenu"
aadharId: "27131052"
panCard:"asgs"
licenseNumber:"757"
}){
id
}
}
use this query in POSTMAN