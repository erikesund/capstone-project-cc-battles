import styles from './styles.module.css';

import {StartGameButton, HighScoreButton, GameNarrator} from 'components';
export const StartMenu = ({viewModeClick}) => {

  const handleButtonClick = (evt) => {
    viewModeClick(evt.target.value);
  }

  return (
    <div className={styles.main}>
      Start Menu/Screen
      <GameNarrator script={'Are you ready to begin your journey??'} />

      {/* <StartGameButton/> */}
      <button className={styles.startButton} onClick={handleButtonClick} value='characters'>Start Game</button>
    </div>
  );
};