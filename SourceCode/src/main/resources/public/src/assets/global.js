export const url = 'https://b15fdaff-6356-46b9-9f25-c61059ac1aab.mock.pstmn.io';
export const id = 1;

export function getColorByCategory(category) {
  let color = "";
  if (category === "Education") {
    color = "purple";
  } else if (category === "Health & Food") {
    color = "blue";
  } else if (category === "Lifestyle") {
    color = "green";
  } else if (category === "Sports") {
    color = "orange";
  } else {
    color = "grey";
  }
  return color;
}