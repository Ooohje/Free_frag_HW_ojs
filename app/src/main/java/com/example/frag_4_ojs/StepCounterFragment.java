package com.example.frag_4_ojs;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.content.pm.PackageManager;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import android.Manifest;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.core.app.ActivityCompat;

public class StepCounterFragment extends Fragment implements SensorEventListener {

    private TextView tv_sensor;
    private SensorManager sm;
    private Sensor sensor_step_detector;
    public Context context;

    private int steps = 0;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_step_counter, container, false);
        // 센서 매니저 인스턴스 생성
        sm = (SensorManager) requireActivity().getSystemService(Context.SENSOR_SERVICE);
        // 스텝 디텍터 센서 인스턴스 생성
        sensor_step_detector = sm.getDefaultSensor(Sensor.TYPE_STEP_DETECTOR);

        context= container.getContext();

        if (ContextCompat.checkSelfPermission(getActivity(), Manifest.permission.ACTIVITY_RECOGNITION) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(getActivity(), new String[]{Manifest.permission.ACTIVITY_RECOGNITION}, 1);
        }


        tv_sensor = view.findViewById(R.id.sensor);
        tv_sensor.setText("0");

        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        // 센서 등록
        sm.registerListener(this, sensor_step_detector, SensorManager.SENSOR_DELAY_NORMAL);
    }

    @Override
    public void onPause() {
        super.onPause();
        // 센서 해제
        sm.unregisterListener(this);
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        Toast.makeText(context, "1", Toast.LENGTH_SHORT).show();
        // 스텝 디텍터 센서 이벤트 발생 시 호출되는 메서드
        if (event.sensor.getType() == Sensor.TYPE_STEP_DETECTOR) {
            steps++;
            tv_sensor.setText(String.valueOf(steps));
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {
        // 센서 정확도 변경 시 호출되는 메서드
    }
}