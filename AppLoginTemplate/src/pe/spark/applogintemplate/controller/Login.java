package pe.spark.applogintemplate.controller;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/*
 * Desarrollado Por: Patrick Wilder Gamboa Gamarra
 * Email: patrick.gamboa.gamarra@hotmail.com
 */

public class Login extends Activity {

	private EditText txtUsuario;
	private EditText txtContrasenia;
	private TextView lblMensaje;
	private Button btnIngresar;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);
		
		txtUsuario = (EditText) findViewById(R.id.txtUsuario);
		txtContrasenia = (EditText) findViewById(R.id.txtContrasenia);
		lblMensaje = (TextView) findViewById(R.id.lblMensaje);
		
		btnIngresar = (Button) findViewById(R.id.btnIngresar);
		
		btnIngresar.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				String usuario = txtUsuario.getText().toString();
				String contrasenia = txtContrasenia.getText().toString(); 
				
				if(txtUsuario.length()==0){
					txtUsuario.setError("Ingrese Usuario");
					lblMensaje.setText("");
				}else if(txtContrasenia.length()==0){
					txtContrasenia.setError("Ingrese Contraseña");
					lblMensaje.setText("");
				}else if(usuario.equals("spark") && contrasenia.equals("123456")){
					lblMensaje.setText("Mensaje: Tudu Beim");
					limpiarCampos();
				}else{
					lblMensaje.setText("Mensaje: Usuario y/o Contraseña Incorrecto");
					limpiarCampos();
				}
				
			}
		});
		
	}
	
	private void limpiarCampos(){
		txtUsuario.setText("");
		txtContrasenia.setText("");
	}
	
}
