INSERT INTO QRTZ_CRON_TRIGGERS (TRIGGER_NAME,TRIGGER_GROUP,CRON_EXPRESSION,TIME_ZONE_ID) 
	VALUES ('TRG_WEST_INTEGRATION','TRG_WEST','0 0/30 * * * ?','America/Chicago');
	
INSERT INTO QRTZ_TRIGGERS (TRIGGER_NAME,TRIGGER_GROUP,JOB_NAME,JOB_GROUP,IS_VOLATILE,DESCRIPTION,
	NEXT_FIRE_TIME,PREV_FIRE_TIME,PRIORITY,TRIGGER_STATE,TRIGGER_TYPE,START_TIME,END_TIME,
	CALENDAR_NAME,MISFIRE_INSTR,JOB_DATA)
	VALUES('TRG_WEST_INTEGRATION','TRG_WEST','WEST_INTEGRATION','GRP_WEST',0,
	'West Survey batch - Imports provider ratings from West Survey Spreadsheet',-1,-1,0,'WAITING','CRON',0,0,null,2,null);
	
INSERT INTO QRTZ_JOB_DETAILS (JOB_NAME,JOB_GROUP,DESCRIPTION,JOB_CLASS_NAME,IS_DURABLE,
	IS_VOLATILE,IS_STATEFUL,REQUESTS_RECOVERY,JOB_DATA) VALUES
	('WEST_INTEGRATION','GRP_WEST','West Integration Tool',
	'com.newco.batch.westsurvey.WestSurveyResponseScheduler','Y','N','N','N',null);
