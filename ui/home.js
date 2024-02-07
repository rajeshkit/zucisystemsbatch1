              var score=5465;
                score="dfdf";
                var name="zuci";
                var isPermenant=true;
                var salary;
                var employee=null;
                console.log('score'+score);
                console.log(name);
                var marks=[456,null,'gerger',true,6767,7878,454];
                var marks1=new Array(67,566,3434,6767,4545,676);
                console.log(marks);
                for (const mark of marks1) {
                    console.log(mark);
                }
                console.log("***************************");
                for (const key in marks) {
                   console.log(key);
                   console.log(marks[key]);
                }
                console.log("++++++++++++++++++++++++++++");
                var employee={employeeId:3334,employeeName:'Rajesh',employeeAddress:'Kundrathur',isTrainer:true}    
                console.log(employee);
                for (const value of Object.values(employee)) {
                    console.log(value);
                }
                for (const key in employee) {
                   console.log(key+"  "+employee[key]);
                } 
                function add(a,b){
                    return a+b;
                }
                var total = add(35,56); 
                console.log('====================================');
                console.log(total);
                console.log('====================================');   
                // var x=function(a,b){ // function expression
                //     return a+b;
                // } 
                var x=function add(a,b){ // function expression
                    return a+b;
                } 
               
                console.log(x(78,846));  
                var y=(a,b)=>{
                    console.log('welcome arrow functions');
                    return a+b;
                }
                       // Arrow functions
                console.log(y(7878,56556));
                paragraphClicked =()=>{alert('paragraph clicked')}   