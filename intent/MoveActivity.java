 startActivity(new Intent(getContext(), LaporList.class));  
// 1. SIMPLE 
  startActivity(new Intent(getContext(), LaporList.class));
  

// 2. WITH INTENT DATA
  Intent data = new Intent(this, SecondActivity.class);
        data.putExtra("key", "value");
        ctx.startActivity(data); 

//get data intent
getIntent().getStringExtra("key");