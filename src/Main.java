/*
Task1:
 Using the health centre as a target system:
    - Inputs: doctors, nurses, medicines, budget.
    - Processes: diagnosis, treatment, record-keeping.
    - Outputs: consultations, treated patients, immunisations.
    - Outcomes: improved community health, reduced disease burden.

Task2:
  General categories:
    - Customer-centred (satisfaction, access, fairness)
    - Service process-centred (waiting time, timeliness, error rates)
    - Resource-centred (cost, staff productivity, utilisation)
    - Output-centred (volume of services delivered)
    - Outcome-centred (impact on well-being, effectiveness)
    - Sustainability/strategic (future readiness, adaptability)

Task4:
INITIALISE simulation
WHILE simulation not finished DO
    // Phase A
    ADVANCE simulation time to next scheduled event

    // Phase B
    PROCESS all events that occur at this time

    // Phase C
    UPDATE system conditions
    SCHEDULE any new future events
    RECORD statistics
END WHILE
REPORT results

Task5:
    // A-phase
Event nextEvent = eventList.peek();
clock = nextEvent.getTime();

    // B-phase
while (eventList.hasEventAt(clock)) {
    Event e = eventList.removeNext(clock);
    e.process(systemState, eventList, statistics);
}

    // C-phase
systemState.update();
List<Event> newEvents = systemState.generateFutureEvents(clock);
for (Event e : newEvents) {
    eventList.insert(e);
}