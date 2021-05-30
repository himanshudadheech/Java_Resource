AlertDialog.Builder builder = new AlertDialog.Builder(context);
builder.setMessage("Enter ypur message");

builder.setPositiveButton(
			"ok",
			new DialogInterface.OnClickListener()
			{
			@override
			public void onClick(DialogInterface dialogInterface, int i)
				{
				   // your operation
				}
			}
			);
			
			
builder.setNegativeButton(
			"Cancle",
			new DialogInterface.OnClickListener()
			{
			@override
			public void onClick(DialogInterface dialogInterface, int i)
				{
				   dialogInterface.cancel();
				}
			}
			);	
			
			
AlertDialog dialog = null;
try{
 dialog = 	builder.create();
}
catch(Exception e){
e.printStackTrace();
}


if(dialog!=null)
{
dialog.show();
}

		