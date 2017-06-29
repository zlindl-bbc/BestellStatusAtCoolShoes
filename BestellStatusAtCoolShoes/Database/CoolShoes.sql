-- phpMyAdmin SQL Dump
-- version 4.7.1
-- https://www.phpmyadmin.net/
--
-- Host: sql11.freesqldatabase.com
-- Erstellungszeit: 29. Jun 2017 um 09:20
-- Server-Version: 5.5.53-0ubuntu0.14.04.1
-- PHP-Version: 7.0.18-0ubuntu0.16.04.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Datenbank: `sql11182658`
--

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `BestellStatus`
--

CREATE TABLE `BestellStatus` (
  `BSID` int(11) NOT NULL,
  `Bestellnummer` varchar(500) NOT NULL,
  `Status` varchar(500) NOT NULL,
  `Bearbeitung` date NOT NULL,
  `Lieferunggeplant` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Daten für Tabelle `BestellStatus`
--

INSERT INTO `BestellStatus` (`BSID`, `Bestellnummer`, `Status`, `Bearbeitung`, `Lieferunggeplant`) VALUES
(1, '1558972', 'Auftrag bestellt', '2015-03-03', '0000-00-00'),
(2, '5268988', 'Auftrag bestellt', '2015-03-03', '0000-00-00'),
(3, '1558972', 'Auftrag aufbereiten', '2015-03-04', '0000-00-00'),
(4, '4423568', 'Auftrag bestellt', '2015-03-04', '0000-00-00'),
(5, '5268988A', 'Auftrag aufbereiten', '2015-03-04', '0000-00-00'),
(6, '5268988B', 'Teilauftrag verspätet', '2015-03-04', '2015-03-20'),
(7, '8526322', 'Auftrag bestellt', '2015-03-05', '0000-00-00'),
(8, '4423568', 'Auftrag aufbereiten', '2015-03-05', '0000-00-00'),
(9, '1558972', 'Auftrag versandbereit', '2015-03-05', '0000-00-00');

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `Bestellungen`
--

CREATE TABLE `Bestellungen` (
  `BID` int(11) NOT NULL,
  `FKKunde` int(11) NOT NULL,
  `FKStatus` int(11) NOT NULL,
  `FKMitarbeiter` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Daten für Tabelle `Bestellungen`
--

INSERT INTO `Bestellungen` (`BID`, `FKKunde`, `FKStatus`, `FKMitarbeiter`) VALUES
(1, 3, 1, 2),
(2, 3, 3, 6),
(3, 3, 9, 1),
(4, 2, 2, 2),
(5, 2, 5, 5),
(6, 2, 6, 5),
(7, 1, 4, 3),
(8, 1, 8, 6),
(9, 4, 7, 2);

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `Kunde`
--

CREATE TABLE `Kunde` (
  `KID` int(11) NOT NULL,
  `KName` varchar(500) NOT NULL,
  `KVorname` varchar(500) NOT NULL,
  `KAdresse` varchar(500) NOT NULL,
  `KPLZ` int(11) NOT NULL,
  `KOrt` varchar(500) NOT NULL,
  `KEmailAdresse` varchar(500) NOT NULL,
  `KPWD` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Daten für Tabelle `Kunde`
--

INSERT INTO `Kunde` (`KID`, `KName`, `KVorname`, `KAdresse`, `KPLZ`, `KOrt`, `KEmailAdresse`, `KPWD`) VALUES
(1, 'Castro', 'Fidel', 'palacio de dio', 10200, 'Havanna', 'fc@cuba.cu', 'revolution'),
(2, 'Max', 'Moritz', 'Wilhelm Busch Strasse', 7000, 'Chur', 'max@busch.ch', 'lempel'),
(3, 'Trump', 'Donald', 'Donald Duck Avenue', 10011, 'New York', 'duck@duck.us', 'money'),
(4, 'Varoufakis', 'Yanis', 'Olymp', 10431, 'Athen', 'yv@greek.gr', 'binblank'),
(5, 'Canepa', 'Cillo', 'Stadion Letzi', 99, 'Zuerich', 'cilo@fcz.ch', 'looser'),
(6, 'Canepa', 'Cillo', 'Stadion Letzi', 99, 'Zuerich', 'cilo@fcz.ch', 'looser');

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `Mitarbeiter`
--

CREATE TABLE `Mitarbeiter` (
  `MID` int(11) NOT NULL,
  `MAName` varchar(500) NOT NULL,
  `MAVorname` varchar(500) NOT NULL,
  `MAPasswort` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Daten für Tabelle `Mitarbeiter`
--

INSERT INTO `Mitarbeiter` (`MID`, `MAName`, `MAVorname`, `MAPasswort`) VALUES
(1, 'Max', 'Muster', '1234'),
(2, 'Ringo', 'Star', '1234'),
(3, 'Pedro', 'Enrique', '1234'),
(4, 'Heatly', 'Bob', '1234'),
(5, 'Blanco', 'Robert', '1234'),
(6, 'Clinton', 'Hillary', '1234');

--
-- Indizes der exportierten Tabellen
--

--
-- Indizes für die Tabelle `BestellStatus`
--
ALTER TABLE `BestellStatus`
  ADD PRIMARY KEY (`BSID`);

--
-- Indizes für die Tabelle `Bestellungen`
--
ALTER TABLE `Bestellungen`
  ADD PRIMARY KEY (`BID`);

--
-- Indizes für die Tabelle `Kunde`
--
ALTER TABLE `Kunde`
  ADD PRIMARY KEY (`KID`);

--
-- Indizes für die Tabelle `Mitarbeiter`
--
ALTER TABLE `Mitarbeiter`
  ADD PRIMARY KEY (`MID`);

--
-- AUTO_INCREMENT für exportierte Tabellen
--

--
-- AUTO_INCREMENT für Tabelle `BestellStatus`
--
ALTER TABLE `BestellStatus`
  MODIFY `BSID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
--
-- AUTO_INCREMENT für Tabelle `Bestellungen`
--
ALTER TABLE `Bestellungen`
  MODIFY `BID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
--
-- AUTO_INCREMENT für Tabelle `Kunde`
--
ALTER TABLE `Kunde`
  MODIFY `KID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT für Tabelle `Mitarbeiter`
--
ALTER TABLE `Mitarbeiter`
  MODIFY `MID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
