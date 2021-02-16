# ClusterDuck APP
**IMPORTANT:** Additional hardware required to operate properly. See below for more details

The ClusterDuck App is an open-source tool built by the ClusterDuck Protocol community, an open-source effort released in partnership with the Linux Foundation in March 2020.  This tool allows you to connect to DuckLink devices over Bluetooth and share data.

DuckLinks, or Ducks, are simple Internet-of-Things devices built on a variety of cheap electronics you can acquire from AliExpress or Amazon.  Once the ClusterDuck Protocol firmware is uploaded, these devices can sync with others nearby to cover large areas as a mesh-network. 

This is a BETA version and development is ongoing.  There most certainly will be bugs.  Want to build with us?  Have questions or feedback?  Join our Slack channel and jump into to daily development conversation:  http://clusterduckprotocol.org/slack



### Using the app

#### 1. Build a ClusterDuck Network
You will need to setup a simple ClusterDuck Network to use the app to interface with your Ducks.  You will need a special BLE-Duck that you can find [here](https://github.com/Call-for-Code/ClusterDuck-Protocol/blob/master/examples/4.Ble-Duck-App/Ble-Duck-App/Ble-Duck-App.ino)  and a PapaDuck whoch is explained in the getting started[here](https://github.com/Call-for-Code/ClusterDuck-Protocol/wiki/getting-started)

#### 2. Install the App from the play store or From Android Studio

Testing has ended and will be available soon!

#### 3. Connect the App to your BLE Duck 

1. Go to your bluetooth settings and pair to your Duck for the first time (default ID is MamaDuck1)
2. Open ClusterDuck App
3. Press "SEARCH" at the top left of the screen
4. Select the Duck you previously paired to (default is MamaDuck1)
5. Press "CONNECT" in the top right of the screen
6. Messaging portal will pop up and you are ready to send messages over the ClusterDuck Network!

Note: Current implementation only supports one way communication from Duck to PapaDuck.  Want to get involved but don't know where to start? See below

![Imgur](https://i.imgur.com/PJTfHpk.jpg)


Improvement Ideas:
- Better Bluetooth pairing experience
- Update Duck firmware over Bluetooth
- Ability to change Duck settings
- Ability to see realtime data
- Testing
