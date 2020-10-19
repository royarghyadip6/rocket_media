function myfunction(){
    var inlet = document.getElementById("input").value;
    var count =0;
    var arr = inlet.split(/\s/);
    arr.sort();
    for(var i = 0;i<arr.length;i++){
        for(var j =i+1;j<arr.length;j++){
            if(arr[i]==arr[j] && arr[i]!=0 && arr[j] !=0){
                arr[j]=0;
                count++;
                break;
            }
        }
    }
    document.getElementById("output").innerHTML=count;
}