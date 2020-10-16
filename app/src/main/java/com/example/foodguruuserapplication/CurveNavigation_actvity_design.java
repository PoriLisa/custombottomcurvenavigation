package com.example.foodguruuserapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.animation.ValueAnimator;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.sdsmdg.harjot.vectormaster.VectorMasterView;
import com.sdsmdg.harjot.vectormaster.models.PathModel;

public class CurveNavigation_actvity_design extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {
    CurvedBottomNavigationView curvedBottomNavigationView;
    VectorMasterView fab, fab2, fab3;
    RelativeLayout rl_parent;
    PathModel outline;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);
        curvedBottomNavigationView = findViewById(R.id.customBottomBar);
        fab = findViewById(R.id.fab);
        fab2 = findViewById(R.id.fab2);
        fab3 = findViewById(R.id.fab3);
        rl_parent = findViewById(R.id.lin_id);
        curvedBottomNavigationView.inflateMenu(R.menu.bottom_menu);
        curvedBottomNavigationView.setOnNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_favorites:
                Toast.makeText(this, "clickone", Toast.LENGTH_SHORT).show();
                draw(6);
                rl_parent.setX(curvedBottomNavigationView.mFirstCurveControlPoint1.x);
                fab.setVisibility(View.VISIBLE);
                fab2.setVisibility(View.GONE);
                fab3.setVisibility(View.GONE);
                drawanimation(fab);
                break;


            case R.id.action_schedules:
                Toast.makeText(this, "clickone schdule", Toast.LENGTH_SHORT).show();
                draw(2);
                rl_parent.setX(curvedBottomNavigationView.mFirstCurveControlPoint1.x);
                fab.setVisibility(View.GONE);
                fab2.setVisibility(View.VISIBLE);
                fab3.setVisibility(View.GONE);
                drawanimation(fab2);
                break;


            case R.id.action_music:
                Toast.makeText(this, "clickone schdule3", Toast.LENGTH_SHORT).show();
                draw();
                rl_parent.setX(curvedBottomNavigationView.mFirstCurveControlPoint1.x);
                fab.setVisibility(View.GONE);
                fab2.setVisibility(View.GONE);
                fab3.setVisibility(View.VISIBLE);
                drawanimation(fab3);
                break;
        }
        return true;
    }

    private void draw() {

        curvedBottomNavigationView.mFirstCurveControlPoint1.set((curvedBottomNavigationView.mNavigationBarWidth *10/12 )-
                (curvedBottomNavigationView.CURVE_CIRCLE_RADIUS * 2 )- ( curvedBottomNavigationView.CURVE_CIRCLE_RADIUS/3),0);

        curvedBottomNavigationView.mFirstCurveEndPoint.set(curvedBottomNavigationView.mNavigationBarWidth * 10 /12 , curvedBottomNavigationView.CURVE_CIRCLE_RADIUS +
                (curvedBottomNavigationView.CURVE_CIRCLE_RADIUS / 4));


        curvedBottomNavigationView.mSecondCurveStartPoint = curvedBottomNavigationView.mFirstCurveEndPoint;
        curvedBottomNavigationView.mSecondCurveEndPoint.set((curvedBottomNavigationView.mNavigationBarWidth *10/12) +
                (curvedBottomNavigationView.CURVE_CIRCLE_RADIUS * 2) + (curvedBottomNavigationView.CURVE_CIRCLE_RADIUS / 3), 0);



        curvedBottomNavigationView.mFirstCurveControlPoint1.set(curvedBottomNavigationView.mFirstCurveStartPoint.x +
                        curvedBottomNavigationView.CURVE_CIRCLE_RADIUS + (curvedBottomNavigationView.CURVE_CIRCLE_RADIUS / 4),
                curvedBottomNavigationView.mFirstCurveStartPoint.y);


        curvedBottomNavigationView.mFirstCurveControlPoint2.set(curvedBottomNavigationView.mFirstCurveEndPoint.x - (curvedBottomNavigationView.CURVE_CIRCLE_RADIUS * 2) +
                curvedBottomNavigationView.CURVE_CIRCLE_RADIUS, curvedBottomNavigationView.mFirstCurveEndPoint.y);

        curvedBottomNavigationView.mSecondCurveControlPoint1.set(curvedBottomNavigationView.mSecondCurveStartPoint.x +
                        (curvedBottomNavigationView.CURVE_CIRCLE_RADIUS * 2) - curvedBottomNavigationView.CURVE_CIRCLE_RADIUS,
                curvedBottomNavigationView.mSecondCurveStartPoint.y);

        curvedBottomNavigationView.mSecondCurveControlPoint2.set(curvedBottomNavigationView.mSecondCurveEndPoint.x -
                        (curvedBottomNavigationView.CURVE_CIRCLE_RADIUS + (curvedBottomNavigationView.CURVE_CIRCLE_RADIUS / 4)),
                curvedBottomNavigationView.mSecondCurveEndPoint.y);

    }

    private void draw(int i) {
        curvedBottomNavigationView.mFirstCurveStartPoint.set((curvedBottomNavigationView.mNavigationBarWidth / i) -
                (curvedBottomNavigationView.CURVE_CIRCLE_RADIUS * 2) - (curvedBottomNavigationView.CURVE_CIRCLE_RADIUS / 3), 0);

        curvedBottomNavigationView.mFirstCurveEndPoint.set(curvedBottomNavigationView.mNavigationBarWidth / i, curvedBottomNavigationView.CURVE_CIRCLE_RADIUS +
                (curvedBottomNavigationView.CURVE_CIRCLE_RADIUS / 4));

        curvedBottomNavigationView.mSecondCurveStartPoint = curvedBottomNavigationView.mFirstCurveEndPoint;
        curvedBottomNavigationView.mSecondCurveEndPoint.set((curvedBottomNavigationView.mNavigationBarWidth / i) +
                (curvedBottomNavigationView.CURVE_CIRCLE_RADIUS * 2) + (curvedBottomNavigationView.CURVE_CIRCLE_RADIUS / 3), 0);

        curvedBottomNavigationView.mFirstCurveControlPoint1.set(curvedBottomNavigationView.mFirstCurveStartPoint.x +
                        curvedBottomNavigationView.CURVE_CIRCLE_RADIUS + (curvedBottomNavigationView.CURVE_CIRCLE_RADIUS / 4),
                curvedBottomNavigationView.mFirstCurveStartPoint.y);

        curvedBottomNavigationView.mFirstCurveControlPoint2.set(curvedBottomNavigationView.mFirstCurveEndPoint.x - (curvedBottomNavigationView.CURVE_CIRCLE_RADIUS * 2) +
                curvedBottomNavigationView.CURVE_CIRCLE_RADIUS, curvedBottomNavigationView.mFirstCurveEndPoint.y);

        curvedBottomNavigationView.mSecondCurveControlPoint1.set(curvedBottomNavigationView.mSecondCurveStartPoint.x +
                        (curvedBottomNavigationView.CURVE_CIRCLE_RADIUS * 2) - curvedBottomNavigationView.CURVE_CIRCLE_RADIUS,
                curvedBottomNavigationView.mSecondCurveStartPoint.y);

        curvedBottomNavigationView.mSecondCurveControlPoint2.set(curvedBottomNavigationView.mSecondCurveEndPoint.x -
                        (curvedBottomNavigationView.CURVE_CIRCLE_RADIUS + (curvedBottomNavigationView.CURVE_CIRCLE_RADIUS / 4)),
                curvedBottomNavigationView.mSecondCurveEndPoint.y);


    }

    private void drawanimation(final VectorMasterView fab) {

        outline = fab.getPathModelByName("outline");
        outline.setStrokeColor(Color.WHITE);
        outline.setTrimPathEnd(0.0f);
        ValueAnimator valueAnimator = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimator.setDuration(1000);

        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                outline.setTrimPathEnd((Float) valueAnimator.getAnimatedValue());
                fab.update();
            }
        });

        valueAnimator.start();

    }


}