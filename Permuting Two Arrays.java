Collections.sort(A);
Collections.sort(B,Collections.reverseOrder());
for(int i=0;i<A.size();i++){
    if(A.get(i)+B.get(i)<k){
        return "NO";
    }
}
return "YES";
    }

}
