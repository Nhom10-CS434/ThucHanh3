package com.example.chimanh_b1_tinhtong;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    //khai báo biến View/giao diện tại đây
    EditText edt_A,edt_B,edt_kq;
    Button btn_cong,btn_tru,btn_nhan,btn_chia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //thiết lập layout/giao diện cho activity
        //ánh xạ/tham chiếu id cho các biến giao diện
        edt_A = findViewById(R.id.edt_A);
        edt_B = findViewById(R.id.edt_B);
        edt_kq = findViewById(R.id.edt_kq);
        btn_cong = findViewById(R.id.btn_cong);
        btn_tru = findViewById(R.id.btn_tru);
        btn_nhan = findViewById(R.id.btn_nhan);
        btn_chia = findViewById(R.id.btn_chia);

        //xử lý tương tác user
        btn_cong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(edt_A.getText().toString()); //lấy dữ liệu từ edt_A ép sang kiểu string
                int b = Integer.parseInt(edt_B.getText().toString());
                int c = a + b;
                edt_kq.setText(c+" "); // hiển thị kết quả

            }
        });
        btn_tru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(edt_A.getText().toString()); //lấy dữ liệu từ edt_A ép sang kiểu string
                int b = Integer.parseInt(edt_B.getText().toString());
                int d = a - b;
                edt_kq.setText(d+" "); // hiển thị kết quả

            }
        });
        btn_nhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(edt_A.getText().toString()); //lấy dữ liệu từ edt_A ép sang kiểu string
                int b = Integer.parseInt(edt_B.getText().toString());
                int e = a * b;
                edt_kq.setText(e+" "); // hiển thị kết quả

            }
        });
        btn_chia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(edt_A.getText().toString()); //lấy dữ liệu từ edt_A ép sang kiểu string
                int b = Integer.parseInt(edt_B.getText().toString());
                int f = a / b;
                edt_kq.setText(f+" "); // hiển thị kết quả

            }
        });
    }
}