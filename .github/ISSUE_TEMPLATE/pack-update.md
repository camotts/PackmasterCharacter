---
name: Pack Update
about: Update the designated pack to be in line with the board game
title: ''
labels: ''
assignees: ''

---

- [ ] Update card's text in `src/main/resources/anniv5Resources/localization/{packname}/Cardstrings.json`
- [ ] Add any images for the card text to the relevant resources in `src/main/resources/anniv5Resources/images`
- [ ] Add any new icons to the ui renderer in `src/main/java/thePackmaster/ui` AND `src/main/java/thePackmaster/SpireAnniversary5Mod.java : in the receiveEditCards function`
- [ ] Modify card values in src/main/java/thePackmaster/cards/{packname}
