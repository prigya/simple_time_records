/**
 * 
 */
package com.accenture.employee.timerecords.business;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.accenture.employee.timerecords.business.repository.TimeRecordRepository;
import com.accenture.employee.timerecords.business.vo.TimeRecord;

/**
 * @author j.venugopalan
 *
 */
@SpringBootApplication
public class TimeRecordsEntityUtility {
	
	public static final Logger log = LoggerFactory.getLogger(TimeRecordsEntityUtility.class);

	@Autowired
	private TimeRecordRepository timerecordrepository;
	
	public List<TimeRecord> getEmployeeTimeRecord(Integer employeeId){
/*	public TimeRecord getEmployeeTimeRecord(Employee employee){
		TimeRecord timeRecord = new TimeRecord();
		DayAttendance dayAttendance = new DayAttendance();
		Collection<DayAttendance> dayAttList = new ArrayList<>();
		timeRecord.setEmployeeId(employee.getEmployeeId());
		
		dayAttendance.setEmployeeId(employee.getEmployeeId());
		dayAttendance.setEmployeeName(employee.getEmployeeName());
		dayAttendance.setEmployeeAddress(employee.getEmployeeAddress());
		dayAttendance.setChargeCode("ASBOS05");
		dayAttendance.setDateStr("21-02-2017");
		dayAttendance.setHours((Integer)9);
		dayAttList.add(dayAttendance);
		timeRecord.setEmpAttendance(dayAttList);
		return timeRecord;*/

		log.info("Inside method : getEmployeeTimeRecord");
		log.info("employeeId : " + employeeId);
		return timerecordrepository.findByEmployeeId(employeeId);
	}

}
