let person={
    name:"Umesh",
    age:45,
    mobile:8693633382,

    getName:function()
    {
        return this.name
    },

    setName : function(name)
    {
        this.name=name
    },

    gettMobileNo:function()
    {
        this.mobile
    }
}

console.log("age="+person.age)
console.log("Name="+person.name)
console.log("mobile="+person.mobile)
person.setName("amit")
console.log("Name="+person.name)