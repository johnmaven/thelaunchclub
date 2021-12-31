/**
 * 
 */
let button=document.querySelector('button');
button.addEventListener('click',()=>{
	
	if(!window.Notification) return;
	Notification
	.requestPermission()
	.then(showNotification)
});

function showNotification(permission){
	console.log("show notification")
	if(permission !=='granted')return;
	
	let notification=new Notification(inputValue = document.getElementById("notification").value ,{body
	:inputValue = document.getElementById("notifi").value  
	})
	
	    

	notification.onclick=()=>{
		window.open('https://google.com')
	}
	
}