function check_WBS_wrapper_Instance(mechanical_pedal_pos_R, mechanical_pedal_pos_L, power1, power2, pump_power1, pump_power2, ground_speed, hyd_supply1, hyd_supply2, accum_pressure_display, wheel_braking_force1, wheel_braking_force2, wheel_braking_force3, wheel_braking_force4, wheel_status1, wheel_status2, wheel_status3, wheel_status4, green_pressure_in_selector_valve, system_validity)


POWER = (((power1 && power2) && pump_power1) && pump_power2);
HYD_PRESSURE_MAX = (isequal(hyd_supply1, int32(10)) && isequal(hyd_supply2, int32(10)));
SPEED = (ground_speed > int32(0));
W1ROLL = wheel_status1;
W2ROLL = wheel_status2;
W3ROLL = wheel_status3;
W4ROLL = wheel_status4;

sldv.assume(((((hyd_supply1 > ~(1)) && (hyd_supply1 < 11)) && ((hyd_supply2 > ~(1)) && (hyd_supply2 < 11))) && ((ground_speed > ~(1)) && (ground_speed < 11))))

end

