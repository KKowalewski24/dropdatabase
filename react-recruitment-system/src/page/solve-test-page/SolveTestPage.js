import React, {useContext} from "react";
import {AppContext} from "../../main/App";

/**
 * This page displaying test (ability to solve) selected by
 * Candidate from list - CandidateTestsPage.js
 * @param props
 * @returns {*}
 * @constructor
 */
export const SolveTestPage = (props) => {

  /*----------------------- VARIABLE REGION -----------------------*/
  const {state, dispatch} = useContext(AppContext);

  alert(sessionStorage.getItem('selectedTestToSolve'));
  console.log(JSON.parse(sessionStorage.getItem('selectedTestToSolve')).testUUID);

  /*------------------------ RETURN REGION ------------------------*/
  return (
    <>

    </>
  );
};

export default SolveTestPage;
    