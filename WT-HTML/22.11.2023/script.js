// function Person(name,age,mobile)
// {
//     this.name=name
//     this.age=age
//     this.mobile=mobile

//     this.setName=function(name)
//     {
//         this.name=name
//     }

//     this.getName=function(){
//         return this.name
//     }


// }

// p1=new Person("lio",24,2747473)
// p2=new Person("tiger",25,652747473)

// console.log(p1)
// console.log(p2)


function Car(name,model,price)
{
    this.name=name
    this.model=model
    this.price=price

    this.setName=function(name){
        this.name=name
    }

    this.setModel=function(model){
        this.model=model
    }

    this.setPrice=function(price){
        this.price=price
    }

    this.getName=function ()
    {
        return this.name
    }

    this.getModel=function ()
    {
        return this.model
    }

    this.getPrice=function ()
    {
        return this.price
    }


}

C1=new Car("maruti suzuki",123,500000)

console.log(C1)





// let person={
//     name:"Umesh",
//     age:45,
//     mobile:8693633382,

//     getName:function()
//     {
//         return this.name
//     },

//     setName : function(name)
//     {
//         this.name=name
//     },

//     gettMobileNo:function()
//     {
//         this.mobile
//     }
// }

// person.city="ballarpur"

// console.log("age="+person.age)
// console.log("Name="+person.name)
// console.log("mobile="+person.mobile)
// person.setName("amit")
// console.log("Name="+person.name)