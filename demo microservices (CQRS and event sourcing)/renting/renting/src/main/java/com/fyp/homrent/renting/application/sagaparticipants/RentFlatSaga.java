// package com.fyp.homrent.renting.application.sagaparticipants;

// import org.axonframework.commandhandling.gateway.CommandGateway;
// import org.axonframework.modelling.saga.EndSaga;
// import org.axonframework.modelling.saga.SagaEventHandler;
// import org.axonframework.modelling.saga.StartSaga;
// import org.axonframework.spring.stereotype.Saga;
// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;
// import org.springframework.beans.factory.annotation.Autowired;

// import java.lang.invoke.MethodHandles;

// import com.fyp.homrent.renting.domain.events.FlatRentedEvent;
// import com.fyp.shareddomain.commands.ChangeFlatStateCommand;
// import com.fyp.shareddomain.event.FlatStateChanged;

// @Saga
// public class RentFlatSaga {

// private final static Logger logger =
// LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
// @Autowired
// private transient CommandGateway commandGateway;

// public RentFlatSaga() {
// }
// /**
// * Dependencies for the Saga Manager
// *
// * @param commandGateway
// */
// public RentFlatSaga(CommandGateway commandGateway) {
// this.commandGateway = commandGateway;
// }
// @StartSaga
// @SagaEventHandler(associationProperty = "flatID")
// public void handle(FlatRentedEvent rentedFlat) {

// logger.info("changing the state of the flat");
// // Send the COmmand to assign tracking details to the Cargo
// commandGateway.send(new ChangeFlatStateCommand(rentedFlat.getFlatID()));
// }

// @SagaEventHandler(associationProperty = "flatId")
// @EndSaga
// public void handle(FlatStateChanged event) {
// logger.info("saga ended");
// }
// }
